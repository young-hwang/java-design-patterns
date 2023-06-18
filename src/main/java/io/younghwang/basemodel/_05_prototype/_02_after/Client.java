package io.younghwang.basemodel._05_prototype._02_after;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser("ggammu");
        githubRepository.setName("young");

        GithubIssue githubIssue = new GithubIssue(githubRepository);
        githubIssue.setId(1);
        githubIssue.setTitle("feat: 신규 기능 추가");

        String url = githubIssue.getUrl();
        System.out.println(url);

        // java Object에서 clone 지원으로 prototype interface 미생성 cloneable interface 이용
        GithubIssue githubIssue1 = (GithubIssue) githubIssue.clone();

        System.out.println(githubIssue != githubIssue1);
        System.out.println(githubIssue.equals(githubIssue1));
        System.out.println(githubIssue.getClass() == githubIssue1.getClass());
        // clone은 기본적으로 shallow copy
        System.out.println(githubIssue.getGithubRepository() == githubIssue1.getGithubRepository());

        githubIssue1.setId(2);
        githubIssue1.setTitle("fix: 신규 기능 에러 수정");
        String url1 = githubIssue1.getUrl();
        System.out.println(url1);
    }
}
