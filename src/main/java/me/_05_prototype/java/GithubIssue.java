package me._05_prototype.java;

import java.util.Objects;

public class GithubIssue implements Cloneable {
    private GithubRepository githubRepository;
    private int id;
    private String title;

    public GithubIssue(GithubRepository githubRepository) {
        this.githubRepository = githubRepository;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return "https://github.com/" + this.githubRepository.getUser() + "/study/issue/" + this.id;
    }

    public GithubRepository getGithubRepository() {
        return githubRepository;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser(this.githubRepository.getUser());
        githubRepository.setName(this.githubRepository.getName());

        GithubIssue githubIssue = new GithubIssue(githubRepository);
        githubIssue.setId(this.getId());
        githubIssue.setTitle(this.getTitle());
        return githubIssue;
    }

    @Override
    public String toString() {
        return "GithubIssue{" +
                "githubRepository=" + githubRepository +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(githubRepository, that.githubRepository) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(githubRepository, id, title);
    }
}
