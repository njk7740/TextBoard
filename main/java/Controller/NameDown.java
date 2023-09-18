package Controller;

import Model.Post;

import java.util.Comparator;

public class NameDown implements Comparator<Post> {
    public int compare(Post p1, Post p2) {
        return p2.getTitle().compareTo(p1.getTitle());
    }
}
