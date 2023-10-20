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
public class Feed extends Post{
    private String caption;
    private int likes;

    public Feed(String caption, int likes, String postId, ContentState status, String timeUpload, ContentType postType, ArrayList<Comment> comments) {
        super(postId, status, timeUpload, postType, comments);
        this.caption = caption;
        this.likes = likes;
    }
    

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
