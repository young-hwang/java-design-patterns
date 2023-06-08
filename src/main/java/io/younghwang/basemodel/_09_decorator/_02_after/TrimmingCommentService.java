package io.younghwang.basemodel._09_decorator._02_after;

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
