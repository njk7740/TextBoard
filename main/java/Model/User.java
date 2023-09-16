package Model;

import java.util.ArrayList;

public class User {
    private String ID;
    private String PW;
    private String nickName;
    ArrayList<Integer> great;

    User(String ID, String PW, String nickName) {
        this.ID = ID;
        this.PW = PW;
        this.nickName = nickName;
    }

    public String getID() {
        return ID;
    }

    public String getPW() {
        return PW;
    }

    public String getnickname() {
        return nickName;
    }
}
