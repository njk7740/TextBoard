package View;

import Model.Comment;

import java.util.ArrayList;
import java.util.Scanner;

public class CommentIO {
    Scanner scanner = new Scanner(System.in);
    public String getCommentText() {
        System.out.print("댓글 내용을 입력해주세요 : ");
        return scanner.nextLine();
    }

    public void printComment(ArrayList<Comment> comments) {
        System.out.println("======= 댓글 =======");
        if(comments.isEmpty()) System.out.println("댓글이 없습니다.");
        else for(Comment comment : comments)
            System.out.printf("%s : %s (%s)\n", comment.getWriter(), comment.getText(), comment.getTime());
        System.out.println("====================");
    }
}
