package be.kdg.htf.models;

/**
 * Created by Robin on 30/11/2017.
 */

public class Poll {
    private String id;
    private String description;
    private Option option;

    public Poll(String id, String description, Option option) {
        this.id = id;
        this.description = description;
        this.option = option;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
