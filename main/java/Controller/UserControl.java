package Controller;

import Model.UserData;
import View.UserIO;

import java.util.HashMap;

public class UserControl {
    UserData userData = new UserData();
    UserIO userIO = new UserIO();

    public void signup() {
        String ID = userIO.getuseID();
        // todo 회원가입 구현
    }
    public HashMap<String, String> login() {
        HashMap<String, String> map = new HashMap<>();
        // todo 로그인 구현
        return map;
    }
}
