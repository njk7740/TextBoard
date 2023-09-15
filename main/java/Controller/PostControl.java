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

    public void update(String userID) {
        System.out.print("수정할 ");
        int num = postIO.getPostNum();
        int idx = postData.toIndex(num);
        if (!postData.exist(idx) || idx < 0) System.out.println("없는 게시물 번호입니다.");
        else {
            if (!postData.get(idx).match(userID)) System.out.println("권한이 없습니다.");
            else {
                map = postIO.getPostInfo();
                postData.update(idx, map.get("제목"), map.get("내용"));
                System.out.println(num + "번 게시물을 수정했습니다.");
            }
        }
    }

    public void delete(String userID) {
        System.out.print("삭제할 ");
        int num = postIO.getPostNum();
        int idx = postData.toIndex(num);
        if (!postData.exist(idx) || idx < 0) System.out.println("없는 게시물 번호입니다.");
        else {
            if (!postData.get(idx).match(userID)) System.out.println("권한이 없습니다.");
            else {
                System.out.println(num + "번 게시물을 삭제했습니다.");
                postData.delete(idx);
            }
        }
    }

    public void detail(String writer, String userID) {
        System.out.print("상세보기 할 ");
        int num = postIO.getPostNum();
        int idx = postData.toIndex(num);
        if (!postData.exist(idx) || idx < 0) System.out.println("없는 게시물 번호입니다.");
        else {
            int run = 0;
            while (run != -2) {
                postData.get(idx).viewUp();
                postIO.putPost(postData.get(idx));
                postData.get(idx).comment().printComments();
                if (run == -1) System.out.println("권한이 없습니다.");
                else if (run == -3) System.out.println("이미 추천하셨습니다.");
                else if (run == 1) System.out.println("댓글이 등록되었습니다.");
                else if (run == 2) System.out.println("해당 게시물을 추천했습니다.");
                else if (run == 3) System.out.println("해당 게시물을 수정했습니다.");
                run = detailMenu(idx, writer, userID);
            }
        }
    }

    public void search() {
        String key = postIO.getSearchKey();
        ArrayList<Integer> arr = postData.getIndexByKey(key);
        for (int i : arr) postIO.putPostSimple(postData.get(i));
    }

    public int detailMenu(int idx, String writer, String userID) {
        int func = postIO.printDetailMenu();
        if (func == 1) return postData.get(idx).comment().addComment(writer);
        else if (func == 2) return postData.get(idx).greatUp(userID);
        else if (func == 3) {
            if (!postData.get(idx).match(userID)) return -1;
            else {
                HashMap<String, String> p = postIO.getPostInfo();
                postData.update(idx, p.get("제목"), p.get("내용"));
                return 3;
            }
        } else if (func == 4) {
            if (!postData.get(idx).match(userID)) return -1;
            else {
                postData.delete(idx);
                System.out.println("해당 게시물을 삭제했습니다.");
                return -2;
            }
        } else if (func == 5) return -2;
        return 0;
    }

    public void setUserInfo(HashMap<String, String> userInfo) {
        postData.setUserInfo(userInfo);
    }
}
