package com.MinorPro.Minor.controller;

import com.MinorPro.Minor.model.Post;
import com.MinorPro.Minor.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forum")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        // Set initial values for likes and dislikes when creating a new post
        post.setLikes(0);
        post.setDislikes(0);
        return postService.createPost(post);
    }

    @PutMapping("/{id}/like")
    public ResponseEntity<String> likePost(@PathVariable Long id) {
        postService.likePost(id);
        return ResponseEntity.ok("Post liked successfully");
    }

    @PutMapping("/{id}/dislike")
    public ResponseEntity<String> dislikePost(@PathVariable Long id) {
        postService.dislikePost(id);
        return ResponseEntity.ok("Post disliked successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return ResponseEntity.ok("Post deleted successfully");
    }
}
