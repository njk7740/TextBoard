package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class PostData {
    ArrayList<Post> posts = new ArrayList<>();
    private HashMap<String, String> userInfo;

    public void add(String title, String detail) {
        Post post = new Post(title, detail, userInfo);
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

    public ArrayList<Integer> getIndexByKey(String key) {
        ArrayList<Integer> idx = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).contains(key))
                idx.add(i);
        }
        return idx;
    }

    public Post get(int index) {
        return posts.get(index);
    }

    public HashMap<String, String> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(HashMap<String, String> userInfo) {
        this.userInfo = userInfo;
    }
}
