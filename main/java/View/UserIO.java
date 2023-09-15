package View;

import java.util.HashMap;
import java.util.Scanner;

public class UserIO {

    Scanner scanner = new Scanner(System.in);

    public void getUseID(HashMap<String, String> map) {
        System.out.print("사용하실 아이디를 입력해주세요 : ");
        map.put("아이디", scanner.nextLine());
    }

    public void getUseInfo(HashMap<String, String> map) {
        System.out.print("사용하실 비밀번호를 입력해주세요 : ");
        map.put("비밀번호", scanner.nextLine());
        System.out.print("사용하실 닉네임을 입력해주세요 : ");
        map.put("닉네임", scanner.nextLine());
    }

    public void getUserInfo(HashMap<String, String> map) {
        System.out.print("아이디를 입력해주세요 : ");
        map.put("아이디", scanner.nextLine());
        System.out.print("비밀번호를 입력해주세요 : ");
        map.put("비밀번호", scanner.nextLine());
    }
}
