package Model;

public class User {
    private String ID;
    private String PW;
    private String Nickname;

    User(String ID, String PW, String Nickname) {
        this.ID = ID;
        this.PW = PW;
        this.Nickname = Nickname;
    }

    public String getID() {
        return ID;
    }

    public String getPW() {
        return PW;
    }

    public String getNickname() {
        return Nickname;
    }
}
