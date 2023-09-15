package View;

import Model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PostIO {

    Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public int getInt() {
        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.print("숫자만 입력해주세요 : ");
            }
        }
    }

    public HashMap<String, String> getPostInfo() {
        HashMap<String, String> info = new HashMap<>();
        System.out.print("제목을 입력해주세요 : ");
        info.put("제목", getString());
        System.out.print("내용을 입력해주세요 : ");
        info.put("내용", getString());
        return info;
    }

    public void putPostSimple(Post post) {
        System.out.println("====================");
        System.out.println("게시물 번호 : " + post.getNumber());
        System.out.println("제목 : " + post.getTitle());
        System.out.println("====================");
    }

    public void putPosts(ArrayList<Post> posts) {
        for (Post post : posts) putPostSimple(post);
    }

    public int getPostNum() {
        System.out.print("게시물 번호를 입력해주세요 : ");
        return getInt();
    }

    public void putPost(Post post) {
        System.out.println("====================");
        System.out.println("게시물 번호 : " + post.getNumber());
        System.out.println("제목 : " + post.getTitle());
        System.out.println("내용 : " + post.getDetail());
        System.out.println("등록날짜 : " + post.getDate());
        System.out.println("조회수 : " + post.getViews());
        System.out.println("====================");
    }

    public String getSearchKey() {
        System.out.print("검색할 키워드를 입력해주세요 : ");
        return getString();
    }

    public int printDetailMenu() {
        System.out.println("상세보기 기능을 선택해주세요");
        System.out.print("(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
        return getInt();
    }
}
