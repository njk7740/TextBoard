package Controller;

import Model.Post;

import java.util.Comparator;

public class ViewDown implements Comparator<Post> {
    public int compare(Post p1, Post p2) {
        return Integer.compare(p2.getViews(), p1.getViews());
    }
}
