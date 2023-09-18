package Controller;

import Model.Post;

import java.util.Comparator;

public class ViewUp implements Comparator<Post> {
    public int compare(Post p1, Post p2) {
        return Integer.compare(p1.getViews(), p2.getViews());
    }
}
