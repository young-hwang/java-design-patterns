package io.github.younghwang.gofbasic._09_decorator._02_after;

public class Client {
    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimFilter = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledTrimFilter) {
            commentService = new TrimmingCommentService(commentService);
        }
        if (enabledSpamFilter) {
            commentService = new SpamFilterCommentService(commentService);
        }

        commentService.addComment("영화");
        commentService.addComment("보는게 재밌다...");
        commentService.addComment("http://young-hwang.github.io");
    }
}
