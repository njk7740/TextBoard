package Controller;

import Model.Comment;
import Model.CommentData;
import View.CommentIO;

public class CommentControl {
    CommentData commentData = new CommentData();
    CommentIO commentIO = new CommentIO();

    public Comment getComment(int index) {
        return commentData.get(index);
    }

    public void addComment() {
        commentData.add(commentIO.getCommentText());
        System.out.println("댓글이 등록되었습니다.");
    }

    public void printComments() {
        commentIO.printComment(commentData.getAll());
    }
}
