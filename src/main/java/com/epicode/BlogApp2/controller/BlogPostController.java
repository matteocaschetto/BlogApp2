package com.epicode.BlogApp2.controller;


import com.epicode.BlogApp2.DTO.BlogPostDTO;
import com.epicode.BlogApp2.model.BlogPost;
import com.epicode.BlogApp2.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BlogPostController {

    @Autowired
    Services services;

    @PostMapping("/blogpost")
    public  BlogPostDTO createBlogPost(@RequestBody BlogPostDTO blogPostDTO){

        if (blogPostDTO.getTitolo() == null){
            throw new RuntimeException("Non è possibile creare senza titolo");
        }
        return services.createBlogPost(blogPostDTO);

    }

}
