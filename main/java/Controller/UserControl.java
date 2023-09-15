package Controller;

import Model.UserData;
import View.UserIO;

import java.util.HashMap;

public class UserControl {
    UserData userData = new UserData();
    UserIO userIO = new UserIO();

    public void signup() {
        HashMap<String, String> info = new HashMap<>();
        userIO.getUseID(info);
        if (userData.compare(info.get("아이디"))) System.out.println("이미 존재하는 아이디입니다.");
        else {
            userIO.getUseInfo(info);
            userData.add(info.get("아이디"), info.get("비밀번호"), info.get("닉네임"));
            System.out.println("회원가입이 완료되었습니다.");
        }
    }

    public HashMap<String, String> login() {
        HashMap<String, String> map = new HashMap<>();
        userIO.getUserInfo(map);
        if (!userData.match(map)) System.out.println("회원정보가 맞지 않습니다.");
        else {
            System.out.println(map.get("닉네임") + "님 환영합니다!");
            return map;
        }
        return null;
    }
}
