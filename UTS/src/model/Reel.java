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
public class Reel extends Post{
    private int duration;
    private int playedCount;

    public Reel(int duration, int playedCount, String postId, ContentState status, String timeUpload, ContentType postType, ArrayList<Comment> comments) {
        super(postId, status, timeUpload, postType, comments);
        this.duration = duration;
        this.playedCount = playedCount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPlayedCount() {
        return playedCount;
    }

    public void setPlayedCount(int playedCount) {
        this.playedCount = playedCount;
    }
    
}
