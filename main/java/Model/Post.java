package Model;

import Controller.CommentControl;
import Util.Util;

public class Post {
    private String title;
    private String detail;
    private int number;
    private String date;
    private int views;

    CommentControl commentControl = new CommentControl();


    Post(String title, String detail) {
        this.title = title;
        this.detail = detail;
        setDate();
        this.views = 0;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
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

    public void viewUp(){
        this.views++;
    }

    public CommentControl comment() {
        return commentControl;
    }

}
