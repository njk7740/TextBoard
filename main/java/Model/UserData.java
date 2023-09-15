package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class UserData {
    ArrayList<User> users = new ArrayList<>();

    public void add(String ID, String PW, String nickName) {
        users.add(new User(ID,PW,nickName));
    }

    public boolean compare(String ID) {
        for(User user : users)
            if (user.getID().equals(ID))
                return true;
        return false;
    }

    public boolean match(HashMap<String, String> map) {
        for(User user : users) {
            if (user.getID().equals(map.get("아이디")) && user.getID().equals(map.get("비밀번호"))) {
                map.put("닉네임", user.getnickname());
                return true;
            }
        }
        return false;
    }

}
