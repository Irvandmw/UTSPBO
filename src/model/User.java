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
import java.util.ArrayList;

public class User {
    private String userId;
    private String username;
    private String password;
    private String bio;
    private ArrayList<Post> posts;

    public User(String userId, String username, String password, String bio, ArrayList<Post> posts) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.posts = posts;
    }

    // Getter dan setter untuk masing-masing field
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
}
