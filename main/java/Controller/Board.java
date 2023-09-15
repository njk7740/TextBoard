package Controller;

import java.util.Scanner;

public class Board {
    Scanner sc = new Scanner(System.in);
    PostControl postControl = new PostControl();

    public void run() {
        while (true) {
            System.out.print("명령어 입력 : ");
            String func = sc.nextLine();

            if (func.equals("exit")) break;
            else if (func.equals("add")) postControl.add();
            else if (func.equals("list")) postControl.list();
            else if (func.equals("update")) postControl.update();

        }
    }
}
