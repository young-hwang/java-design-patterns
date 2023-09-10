package me._05_prototype.gof._02_after;

public class GithubRepository {
    private String name;
    private String user;

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }
}
