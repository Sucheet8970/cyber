package com.MinorPro.Minor.service;

import com.MinorPro.Minor.model.Post;
import com.MinorPro.Minor.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List; // Add this import statement

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post createPost(Post post) {
        // Set initial values for likes and dislikes
        post.setLikes(0);
        post.setDislikes(0);
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    public void likePost(Long id) {
        // Your implementation for incrementing likes
    }

    public void dislikePost(Long id) {
        // Your implementation for incrementing dislikes
    }
}
