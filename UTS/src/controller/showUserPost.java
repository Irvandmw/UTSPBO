/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.ContentState;
import model.Feed;
import model.Post;
import model.Reel;
import model.Story;

/**
 *
 * @author Irvan
 */
public class showUserPost {
    public void showUserPosts(ArrayList<Post> posts) {
        ArrayList<Post> pinnedPosts = new ArrayList<>();
        ArrayList<Post> showedPosts = new ArrayList<>();
        ArrayList<Post> archivedPosts = new ArrayList<>();
        int deleted = 0;
        
        for (Post post : posts) {
            if (post.getStatus() == ContentState.PINNED) {
                pinnedPosts.add(post);
            } else {
                String timeUpload = post.getTimeUpload();
                String[] dateTimeParts = timeUpload.split(" ");
                String[] dateParts = dateTimeParts[0].split("-");
                int month = Integer.parseInt(dateParts[1]);

                if (post.getStatus() == ContentState.SHOWED) {
                    showedPosts.add(post);
                } else if (post.getStatus() == ContentState.ARCHIVED) {
                    archivedPosts.add(post);
                } else if (post.getStatus() == ContentState.DELETED) {
                    deleted++;
                }
            }
        }

        // Menampilkan Post yang berstatus PINNED
        System.out.println("Post dengan status PINNED:");
        for (Post post : pinnedPosts) {
            if (post instanceof Feed) {
                Feed feed = (Feed) post;
                System.out.println("Feed - Likes: " + feed.getLikes());
            } else if (post instanceof Story) {
                Story story = (Story) post;
                System.out.println("Story - Views: " + story.getViews());
            } else if (post instanceof Reel) {
                Reel reel = (Reel) post;
                System.out.println("Reel - Played Count: " + reel.getPlayedCount());
            }
        }

        // Menampilkan Post yang berstatus SHOWED
        System.out.println("Post dengan status SHOWED:");
        for (Post post : showedPosts) {
            if (post instanceof Feed) {
                Feed feed = (Feed) post;
                System.out.println("Feed - Likes: " + feed.getLikes());
            } else if (post instanceof Story) {
                Story story = (Story) post;
                System.out.println("Story - Views: " + story.getViews());
            } else if (post instanceof Reel) {
                Reel reel = (Reel) post;
                System.out.println("Reel - Played Count: " + reel.getPlayedCount());
            }
        }

        // Menampilkan Post yang berstatus ARCHIVED
        System.out.println("Post dengan status ARCHIVED:");
        for (Post post : archivedPosts) {
            if (post instanceof Feed) {
                Feed feed = (Feed) post;
                System.out.println("Feed - Likes: " + feed.getLikes());
            } else if (post instanceof Story) {
                Story story = (Story) post;
                System.out.println("Story - Views: " + story.getViews());
            } else if (post instanceof Reel) {
                Reel reel = (Reel) post;
                System.out.println("Reel - Played Count: " + reel.getPlayedCount());
            }
        }

        // Menampilkan jumlah Post dengan status DELETED
        System.out.println("Jumlah Post dengan status DELETED: " + deleted);
    }
}

