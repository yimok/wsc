package koreatech.cse.domain;
import java.sql.Date;
//package koreatech.cse.domain;

/**
 * Created by Yimo on 2016-10-27.
 */
public class MyBook {

    private String title;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}