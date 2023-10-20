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
public class showBestUserPost {
    public String showUserBestPost(ArrayList<Post>posts) {
    String teks = "Post Terbaik Pengguna:\n";

    Post bestFeed = null;
    Post bestStory = null;
    Post bestReel = null;
    for (Reel post : posts) {
        if (bestReel == null || (post.getPlayedCount() > bestReel.getPlayedCount()) || (post.getPlayedCount() == bestReel.getPlayedCount() && post.getTimeUpload().compareTo(bestReel.getTimeUpload()) > 0)) {
            bestReel = post;

    }
    if (bestFeed != null) {
        teks += "Feed Terbaik: " + bestFeed.getPostId() + " - Likes: " + bestFeed.getLikes() + " - Waktu: " + bestFeed.getTimeUpload() + "\n";
    }
    if (bestStory != null) {
        teks += "Story Terbaik: " + bestStory.getPostId() + " - Views: " + bestStory.getViews() + " - Waktu: " + bestStory.getTimeUpload() + "\n";
    }
    if (bestReel != null) {
        teks += "Reel Terbaik: " + bestReel.getPostId() + " - PlayedCount: " + bestReel.getPlayedCount() + " - Waktu: " + bestReel.getTimeUpload() + "\n";
    }

    return teks;
}

}
