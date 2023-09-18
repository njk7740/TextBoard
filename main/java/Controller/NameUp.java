package Controller;

import Model.Post;

import java.util.Comparator;

public class NameUp implements Comparator<Post> {
    public int compare(Post p1, Post p2) {
        return p1.getTitle().compareTo(p2.getTitle());
    }
}
