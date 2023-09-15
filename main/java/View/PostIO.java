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
        return Integer.parseInt(scanner.nextLine());
    }

    public HashMap<String, String> getPostInfo() {
        HashMap<String, String> info = new HashMap<>();
        System.out.print("제목을 입력해주세요 : ");
        info.put("제목", getString());
        System.out.print("내용을 입력해주세요 : ");
        info.put("내용", getString());
        return info;
    }

    public void putPost(Post post) {
        System.out.println("====================");
        System.out.println("게시물 번호 : " + post.getNumber());
        System.out.println("제목 : " + post.getTitle());
        System.out.println("내용 : " + post.getDetail());
        System.out.println("====================");
    }

    public void putPosts(ArrayList<Post> posts) {
        for (Post post : posts) putPost(post);
    }

    public HashMap<String, String> getUpdatePostNumber() {
        HashMap<String, String> map = new HashMap<>();
        System.out.print("수정할 게시물 번호를 입력해주세요 : ");
        map.put("번호", getString());
        System.out.print("제목을 입력해주세요 : ");
        map.put("제목", getString());
        System.out.print("내용을 입력해주세요 : ");
        map.put("내용", getString());
        return map;
    }
}
