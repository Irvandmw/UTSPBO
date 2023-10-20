/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Feed;
import model.Post;
import model.Reel;
import model.Story;

/**
 *
 * @author Irvan
 */
public class showPost {
    public String showPost(String postId, ArrayList<Post> posts) {
    Post foundPost = null;
    for (Post post : posts) {
        if (post.getPostId().equals(postId)) {
            foundPost = post;
            break;
        }
    }
    String text="";
    if (foundPost != null) {
        // Tampilkan detail Post berdasarkan tipe Post
        if (foundPost instanceof Feed) {
            Feed feed = (Feed) foundPost;
            text+=("Post Type: Feed");
            text+=("Post ID: " + feed.getPostId());
            text+=("Caption: " + feed.getCaption());
            text+=("Likes: " + feed.getLikes());
            text+=("Status: " + feed.getStatus());
            text+=("Time Upload: " + feed.getTimeUpload());
        } else if (foundPost instanceof Story) {
            Story story = (Story) foundPost;
            text+=("Post Type: Story");
            text+=("Post ID: " + story.getPostId());
            text+=("Duration: " + story.getDuration() + " seconds");
            text+=("Views: " + story.getViews());
            text+=("Status: " + story.getStatus());
            text+=("Time Upload: " + story.getTimeUpload());
        } else if (foundPost instanceof Reel) {
            Reel reel = (Reel) foundPost;
            text+=("Post Type: Reel");
            text+=("Post ID: " + reel.getPostId());
            text+=("Duration: " + reel.getDuration() + " seconds");
            text+=("Played Count: " + reel.getPlayedCount());
            text+=("Status: " + reel.getStatus());
            text+=("Time Upload: " + reel.getTimeUpload());
        } else {
            text+=("Post Type: Unknown");
            text+=("Post ID: " + foundPost.getPostId());
            text+=("Status: " + foundPost.getStatus());
            text+=("Time Upload: " + foundPost.getTimeUpload());
        }
    } else {
        text+=("Post not found.");
    }
    return text;
}

}
