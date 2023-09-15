package Controller;

import Model.PostData;
import View.PostIO;

import java.util.ArrayList;
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
        System.out.print("수정할 ");
        int num = postIO.getPostNum();
        int idx = postData.toIndex(num);
        if (!postData.exist(idx) || idx < 0) System.out.println("없는 게시물 번호입니다.");
        else {
            map = postIO.getPostInfo();
            postData.update(idx, map.get("제목"), map.get("내용"));
            System.out.println(num + "번 게시물을 수정했습니다.");
        }
    }

    public void delete() {
        System.out.print("삭제할 ");
        int num = postIO.getPostNum();
        int idx = postData.toIndex(num);
        if (!postData.exist(idx) || idx < 0) System.out.println("없는 게시물 번호입니다.");
        else {
            System.out.println(num + "번 게시물을 삭제했습니다.");
            postData.delete(idx);
        }
    }

    public void detail() {
        System.out.print("상세보기 할 ");
        int num = postIO.getPostNum();
        int idx = postData.toIndex(num);
        if (!postData.exist(idx) || idx < 0) System.out.println("없는 게시물 번호입니다.");
        else {
            do {
                postData.get(idx).viewUp();
                postIO.putPost(postData.get(idx));
                postData.get(idx).comment().printComments();
            } while(detailMenu(idx));

        }
    }

    public void test() {
        postData.add("첫번째 테스트용 게시물", "블라블라");
        postData.add("두번째 자바 프로그래밍", "블라블라");
        postData.add("세번째 나를 자바바", "블라블라");
        postData.add("네번째 뭘 적지", "블라블라");
        postData.add("다섯번째 요기까지 테스트용 게시물", "블라블라");

        System.out.println("테스트용 게시물 추가 완료");
    }

    public void search() {
        String key = postIO.getSearchKey();
        ArrayList<Integer> arr = postData.getIndexByKey(key);
        for (int i : arr) postIO.putPostSimple(postData.get(i));
    }

    public boolean detailMenu(int idx) {
        int func = postIO.printDetailMenu();
        if (func == 1) postData.get(idx).comment().addComment();
            //else if(func == 2)
        else if (func == 5) return false;
        return true;
    }
}
