package be.kdg.htf.models;

/**
 * Created by Robin on 30/11/2017.
 */

public class Option {
    private String id;
    private String name;
    private int votes;
    private boolean youVoted;

    public Option(String id, String name, int votes, boolean youVoted) {
        this.id = id;
        this.name = name;
        this.votes = votes;
        this.youVoted = youVoted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public boolean isYouVoted() {
        return youVoted;
    }

    public void setYouVoted(boolean youVoted) {
        this.youVoted = youVoted;
    }
}
