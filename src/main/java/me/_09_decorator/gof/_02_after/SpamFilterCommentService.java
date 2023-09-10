package me._09_decorator.gof._02_after;

public class SpamFilterCommentService extends DecoratorCommentService {
    public SpamFilterCommentService(CommentService commentService) {
        super(commentService);
    }

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
