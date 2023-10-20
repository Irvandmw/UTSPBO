/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Irvan
 */
public class Post {
    private String postId;
    private ContentState status;
    private String timeUpload;
    private ContentType postType;
    private ArrayList<Comment> comments;

    public Post(String postId, ContentState status, String timeUpload, ContentType postType, ArrayList<Comment> comments) {
        this.postId = postId;
        this.status = status;
        this.timeUpload = timeUpload;
        this.postType = postType;
        this.comments = comments;
    }

    // Getter dan setter untuk masing-masing field
    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public ContentState getStatus() {
        return status;
    }

    public void setStatus(ContentState status) {
        this.status = status;
    }

    public String getTimeUpload() {
        return timeUpload;
    }

    public void setTimeUpload(String timeUpload) {
        this.timeUpload = timeUpload;
    }

    public ContentType getPostType() {
        return postType;
    }

    public void setPostType(ContentType postType) {
        this.postType = postType;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
}