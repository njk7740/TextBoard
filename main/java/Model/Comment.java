package Model;

import Util.Util;

public class Comment {
    String text;
    String time;
    String writer;

    Comment(String text, String writer) {
        this.text = text;
        this.time = Util.getNowTime();
        this.writer = writer;
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }

    public String getWriter() {
        return writer;
    }
}
