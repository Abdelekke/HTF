package be.kdg.htf.models;

/**
 * Created by Robin on 30/11/2017.
 */

public class Image {
    private String id;
    private int date; // fix datetime
    private String description;
    private String url;
    private User user;

    public Image(String id, int date, String description, String url, User user) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.url = url;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
