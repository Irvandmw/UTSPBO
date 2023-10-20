/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.ContentState;
import model.Post;

/**
 *
 * @author Irvan
 */
public class changePostState {
    public String changePostState(String postId, ContentState newStatus, ArrayList<Post> posts) {
    String teks = "";
    Post postDitemukan = null;
    for (Post post : posts) {
        if (post.getPostId().equals(postId)) {
            postDitemukan = post;
            break;
        }
    }

    if (postDitemukan != null) {
        ContentState statusSaatIni = postDitemukan.getStatus();
        boolean dapatMenggantiStatus = false;
        if (statusSaatIni == ContentState.SHOWED) {
            dapatMenggantiStatus = (newStatus == ContentState.ARCHIVED || newStatus == ContentState.PINNED || newStatus == ContentState.DELETED);
        } else if (statusSaatIni == ContentState.ARCHIVED) {
             dapatMenggantiStatus = (newStatus == ContentState.DELETED);
        } else if (statusSaatIni == ContentState.PINNED) {
             dapatMenggantiStatus = false;
        }

        if (dapatMenggantiStatus) {
            postDitemukan.setStatus(newStatus);
            teks = "Status Post dengan ID " + postId + " telah diubah menjadi " + newStatus;
        } else {
            teks = "Perubahan status tidak valid untuk Post dengan ID " + postId;
        }
    } else {
        teks = "Post tidak ditemukan.";
    }
    return teks;
}


}
