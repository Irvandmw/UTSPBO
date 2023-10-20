/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author Irvan
 */
public class dummyController {
    
    public static ArrayList<Comment> comments1 = new ArrayList<Comment>(){
        Comment comment1 = new Comment("1", "Ini adalah komentar 1", ContentState.SHOWED);
        Comment comment2 = new Comment("2", "Ini adalah komentar 2", ContentState.SHOWED);
    };
    public static ArrayList<Comment> comments2 = new ArrayList<>(){;
        Comment comment3 = new Comment("3", "Ini adalah komentar 3", ContentState.ARCHIVED);
    };
    
    public static ArrayList<Post> userPosts = new ArrayList<>(){
    User user = new User("1", "username123", "password123", "Ini adalah bio pengguna", userPosts);

    Reel reel = new Reel(60, 1000, "2", ContentState.SHOWED, "2023-10-20 10:00:00", ContentType.VIDEO, comments1);

    Story story = new Story(15, 500, "3", ContentState.SHOWED, "2023-10-20 09:00:00", ContentType.PICTURE, comments2);

    Feed feed = new Feed("Caption feed", 200, "4", ContentState.SHOWED, "2023-10-20 08:00:00", ContentType.PICTURE, comments1);
        {
            userPosts.add(reel);
            userPosts.add(story);
            userPosts.add(feed);
        }
    };
}
