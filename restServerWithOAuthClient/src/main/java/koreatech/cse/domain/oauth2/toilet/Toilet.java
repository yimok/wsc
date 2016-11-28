package koreatech.cse.domain.oauth2.toilet;

/**
 * Created by HYERIM on 2016-11-28.
 */
public class Toilet {
    private Item[] item;

    public Item[] getItem ()
    {
        return item;
    }

    public void setItem (Item[] item)
    {
        this.item = item;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [item = " + item + "]";
    }
}
