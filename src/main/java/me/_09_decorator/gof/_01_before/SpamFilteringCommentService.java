package me._09_decorator.gof._01_before;

public class SpamFilteringCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        if (!isSpam(comment)) {
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
