package me._05_prototype.gof._01_before;

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
