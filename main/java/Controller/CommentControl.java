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

    public int addComment(String writer) {
        commentData.add(commentIO.getCommentText(), writer);
        return 1;
    }

    public void printComments() {
        commentIO.printComment(commentData.getAll());
    }
}
