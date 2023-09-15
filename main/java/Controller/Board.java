package Controller;

import java.util.HashMap;
import java.util.Scanner;

public class Board {
    Scanner sc = new Scanner(System.in);
    PostControl postControl = new PostControl();
    UserControl userControl = new UserControl();
    HashMap<String, String> userInfo;

    public void run() {

        while (true) {
            if (userInfo == null)
                System.out.print("명령어 입력 : ");
            else
                System.out.printf("명령어 입력 [%s] : ", userInfo.get("닉네임"));
            String func = sc.nextLine();

            if (func.equals("exit")) break;
            else if (func.equals("add")) postControl.add();
            else if (func.equals("list")) postControl.list();
            else if (func.equals("update")) postControl.update();
            else if (func.equals("delete")) postControl.delete();
            else if (func.equals("detail")) postControl.detail();
            else if (func.equals("test")) postControl.test();
            else if (func.equals("search")) postControl.search();
            else if (func.equals("signup")) userControl.signup();
            else if (func.equals("login")) userInfo = userControl.login();

        }
    }
}
