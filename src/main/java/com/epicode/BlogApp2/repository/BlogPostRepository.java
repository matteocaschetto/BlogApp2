package com.epicode.BlogApp2.repository;

import com.epicode.BlogApp2.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
