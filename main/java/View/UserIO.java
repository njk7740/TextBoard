package View;

import java.util.Scanner;

public class UserIO {

    Scanner scanner = new Scanner(System.in);
    public String getuseID() {
        System.out.print("사용하실 아이디를 입력해주세요 : ");
        return scanner.nextLine();
    }
}
