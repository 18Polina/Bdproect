package com.example.Bdproect.repo;

import com.example.Bdproect.Models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository  extends CrudRepository<Post,Long> {
    List<Post> findByTitle(String title);
}
