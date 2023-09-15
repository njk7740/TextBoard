package Model;

import java.util.ArrayList;

public class CommentData {
    ArrayList<Comment> comments = new ArrayList<>();

    public void add(String text) {
        comments.add(new Comment(text));
    }
    public Comment get(int index) {
        return comments.get(index);
    }

    public ArrayList<Comment> getAll() {
        return comments;
    }
}
