package Model;

import Util.Util;

public class Comment {
    String text;
    String time;

    Comment(String text) {
        this.text = text;
        this.time = Util.getNowTime();
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }
}
