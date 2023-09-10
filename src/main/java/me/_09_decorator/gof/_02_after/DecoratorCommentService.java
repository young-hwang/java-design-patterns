package me._09_decorator.gof._02_after;

public class DecoratorCommentService implements CommentService {
    private CommentService commentService;

    public DecoratorCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        this.commentService.addComment(comment);
    }
}
