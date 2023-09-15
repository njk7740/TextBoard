package Model;

import java.util.ArrayList;

public class PostData {
    ArrayList<Post> posts = new ArrayList<>();

    public void add(String title, String detail) {
        Post post = new Post(title, detail);
        if (posts.isEmpty()) post.setNumber(1);
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
        for (int i = 0; i < posts.size(); i++) {
            if (number == posts.get(i).getNumber())
                return i;
        }
        return -1;
    }

    public boolean exist(int index) {
        return posts.size() > index;
    }


    public void update(int index, String title, String detail) {

        posts.get(index).setTitle(title);
        posts.get(index).setDetail(detail);
        posts.get(index).setDate();
    }

    public void delete(int index) {
        posts.remove(index);
    }

    /*
    public ArrayList<Integer> getIndexByKey(String key) {
        ArrayList<Integer> idx = new ArrayList<>();
        for(int i = 0; i < posts.size(); i++) {
            // todo search 인덱스 뽑아내기 구현
        }
    }

     */

}
