package io.github.younghwang.gofbasic._05_prototype._01_before;

public class GithubIssue {
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
        return super.clone();
    }
}
