package Controller;

import java.util.HashMap;
import java.util.Scanner;

public class Board {
    Scanner sc = new Scanner(System.in);
    PostControl postControl = new PostControl();
    UserControl userControl = new UserControl();
    HashMap<String, String> userInfo;

    public void run() {

        label:
        while (true) {
            if (userInfo == null)
                System.out.print("명령어 입력 : ");
            else
                System.out.printf("명령어 입력 [%s] : ", userInfo.get("닉네임"));
            String func = sc.nextLine();

            switch (func) {
                case "exit":
                    break label;
                case "add":
                    if (userInfo == null) System.out.println("로그인 후 이용해주세요.");
                    else postControl.add();
                    break;
                case "list":
                    postControl.list();
                    break;
                case "update":
                    if (userInfo == null) System.out.println("로그인 후 이용해주세요.");
                    else postControl.update(userInfo.get("아이디"));
                    break;
                case "delete":
                    if (userInfo == null) System.out.println("로그인 후 이용해주세요.");
                    else postControl.delete(userInfo.get("아이디"));
                    break;
                case "detail":
                    if (userInfo == null) postControl.detail("(guest)", "guest");
                    else postControl.detail(userInfo.get("닉네임"), userInfo.get("아이디"));
                    break;
                case "search":
                    postControl.search();
                    break;
                case "signup":
                    userControl.signup();
                    break;
                case "login":
                    userInfo = userControl.login();
                    postControl.setUserInfo(userInfo);
                    break;
                case "logout":
                    userInfo = null;
                    System.out.println("로그아웃이 완료되었습니다.");
                    break;
            }
        }
    }
}
