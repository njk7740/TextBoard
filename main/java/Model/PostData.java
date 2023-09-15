package Model;

import java.util.ArrayList;

public class PostData {
    ArrayList<Post> posts = new ArrayList<>();

    public void add(String title, String detail) {
        Post post = new Post(title, detail);
        if(posts.isEmpty()) post.setNumber(1);
        else post.setNumber(posts.get(posts.size() - 1).getNumber() + 1);
        posts.add(post);
    }
    public boolean isEmpty() {
        return posts.isEmpty();
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public int toIndex(int number) {
        for(int i = 0; i < posts.size(); i++) {
            if(number == posts.get(i).getNumber())
                return i;
        }
        return -1;
    }

    public void update(int index, String title, String detail) {
        posts.get(index).setTitle(title);
        posts.get(index).setDetail(detail);
    }

}
