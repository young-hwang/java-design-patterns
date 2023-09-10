package me._05_prototype.gof._01_before;

public class Client {
    public static void main(String[] args) {
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser("ggammu");
        githubRepository.setName("young");

        GithubIssue githubIssue = new GithubIssue(githubRepository);
        githubIssue.setId(1);
        githubIssue.setTitle("feat: 신규 기능 추가");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue githubIssue2 = new GithubIssue(githubRepository);
        githubIssue.setId(2);
        githubIssue.setTitle("fix: 신규 기능 에러 수정");

        String url2 = githubIssue.getUrl();
        System.out.println(url2);
    }
}
