package me._09_decorator.gof._01_before;

public class TrimmingCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
