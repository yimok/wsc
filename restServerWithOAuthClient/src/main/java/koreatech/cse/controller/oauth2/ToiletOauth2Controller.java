package koreatech.cse.controller.oauth2;

import koreatech.cse.domain.oauth2.toilet.Item;
import koreatech.cse.domain.oauth2.toilet.Toilet;
import koreatech.cse.service.UserService;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.GrantType;
import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created by HYERIM on 2016-11-28.
 */
@Controller
@RequestMapping("/oauth2")
public class ToiletOauth2Controller {
    private static String toilet_client_id = "706d6e476370686c39374b6767786b";      //본인 것으로 추가하기
    private static String toilet_url = "http://openAPI.seoul.go.kr:8088/";
    private static String toilet_url_end = "/xml/GeoInfoPublicToiletWGS/1/5/1";

    @Inject
    private UserService userService;

    private OAuth2Template toiletOAuth2Template = new OAuth2Template(
            toilet_client_id,
            toilet_url,
            toilet_url_end,
            toilet_url_end
    );

    private HashMap<String, AccessGrant> toiletAccessToken = new HashMap();

    @RequestMapping("/toilet_authorization_code")
    public String toilet_authorization_code() {
        OAuth2Parameters parameters = new OAuth2Parameters();
        parameters.setRedirectUri(toilet_url);
        parameters.setScope("public_profile,email,user_friends,user_likes");

        String authorizeUrl = toiletOAuth2Template.buildAuthorizeUrl(GrantType.AUTHORIZATION_CODE, parameters);
        System.out.println("authorizeUrl: " + authorizeUrl);

        return "redirect:" + authorizeUrl;
    }

    @RequestMapping("/toilet_callback")
    public String toilet_callback(Model model, HttpServletRequest request, @RequestParam(required=true) String code) throws Exception {
        System.out.println("Toilet Callback is called!!");
        System.out.println(code);

        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        simpleClientHttpRequestFactory.setOutputStreaming(false);
        toiletOAuth2Template.setRequestFactory(simpleClientHttpRequestFactory);

        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<String, String>();
        multiValueMap.add("client_id", toilet_client_id);

        AccessGrant accessGrant = toiletOAuth2Template.exchangeForAccess(
                code,
                toilet_url,
                multiValueMap
        );

        System.out.println("------ AccessGrant ------");
        System.out.println(accessGrant.getAccessToken());
        System.out.println(accessGrant.getRefreshToken());
        System.out.println(accessGrant.getExpireTime());
        System.out.println(accessGrant.getScope());
        System.out.println();

        Item toiletItem = getFacebookProfile(accessGrant);
        if (toiletItem != null) {
            toiletAccessToken.put(toiletItem.getId(), accessGrant);
        }

        return userService.facebookLogin(request, toiletItem);
    }

    public Item getToiletItem(AccessGrant accessGrant) {
        RestTemplate restTemplate = new RestTemplate();
        Item toiletItem = null;
        try {
            ResponseEntity<toiletItem> facebookProfileResponseEntity
                    = restTemplate.getForEntity(facebook_profile_url + accessGrant.getAccessToken(), Item.class);
            toiletItem = facebookProfileResponseEntity.getBody();
            System.out.println(toiletItem);
        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + ": " + e.getStatusText());
        }
        return toiletItem;
    }
}
