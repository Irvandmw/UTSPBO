/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Irvan
 */
public class Comment {
    private String commentId;
    private String text;
    private ContentState status2;  // Menambahkan ContentState untuk komentar

    public Comment(String commentId, String text, ContentState status2) {
        this.commentId = commentId;
        this.text = text;
        this.status2 = status2;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ContentState getCommentStatus() {
        return status2;
    }

    public void setCommentStatus(ContentState commentStatus) {
        this.status2 = commentStatus;
    }
}
