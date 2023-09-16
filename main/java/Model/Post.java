package Model;

import Controller.CommentControl;
import Util.Util;

import java.util.ArrayList;
import java.util.HashMap;

public class Post {
    private String title;
    private String detail;
    private int number;
    private String date;
    private int views;
    private HashMap<String, String> userInfo;
    private int greats;
    private ArrayList<String> greatUserID = new ArrayList<>();
    CommentControl commentControl = new CommentControl();


    Post(String title, String detail, HashMap<String, String> userInfo) {
        this.title = title;
        this.detail = detail;
        setDate();
        this.views = 0;
        this.userInfo = userInfo;
        this.greats = 0;
    }

    public int getViews() {
        return views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        this.date = Util.getNowTime();
    }

    public boolean contains(String key) {
        return this.title.contains(key);
    }

    public void viewUp() {
        this.views++;
    }

    public CommentControl comment() {
        return commentControl;
    }

    public HashMap<String, String> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(HashMap<String, String> userInfo) {
        this.userInfo = userInfo;
    }

    public int getGreats() {
        return greats;
    }

    public void setGreats(int greats) {
        this.greats = greats;
    }

    public boolean match(String ID) {
        return ID.equals(userInfo.get("아이디"));
    }

    public int greatUp(String userID) {

        for (int i = 0; i < greatUserID.size(); i++) {
            if (userID.equals(greatUserID.get(i))) {
                greats--;
                greatUserID.remove(i);
                return -3;
            }
        }

        greats++;
        greatUserID.add(userID);
        return 2;
    }

    public boolean matchGreatUser(String userID) {
        for (String str : greatUserID) {
            if (str.equals(userID)) {
                return true;
            }
        }
        return false;
    }

}
