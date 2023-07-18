package io.github.younghwang.gofbasic._05_prototype._03_java;

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

    @Override
    public String toString() {
        return "GithubRepository{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
