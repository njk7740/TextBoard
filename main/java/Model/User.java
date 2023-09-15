package Model;

public class User {
    private String ID;
    private String PW;
    private String nickName;

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
