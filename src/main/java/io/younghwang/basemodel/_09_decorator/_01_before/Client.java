package io.younghwang.basemodel._09_decorator._01_before;

public class Client {
    private CommentService commentService;

    private boolean enabledSpamFilter;
    private boolean enabledTrimming;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        this.commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("영화");
        client.writeComment("보는게 재밌다...");
        client.writeComment("http://young-hwang.github.io");
    }
}
