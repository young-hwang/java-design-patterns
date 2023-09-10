package me._09_decorator.gof._02_after;

public class TrimmingCommentService extends DecoratorCommentService {
    public TrimmingCommentService(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
