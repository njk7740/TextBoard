package Controller;

import Model.PostData;
import View.PostIO;

import java.util.HashMap;

public class PostControl {
    PostData postData = new PostData();
    PostIO postIO = new PostIO();
    HashMap<String, String> map;

    public void add() {
        map = postIO.getPostInfo();
        postData.add(map.get("제목"), map.get("내용"));
        System.out.println("게시물이 추가되었습니다.");
    }

    public void list() {
        if (postData.isEmpty()) System.out.println("게시물이 없습니다.");
        else postIO.putPosts(postData.getPosts());
    }

    public void update() {
        map = postIO.getUpdatePostNumber();
        int idx = postData.toIndex(Integer.parseInt(map.get("번호")));
        postData.update(idx, map.get("제목"), map.get("내용"));
        System.out.println(map.get("번호") + "번 게시물을 수정했습니다.");
    }
}
