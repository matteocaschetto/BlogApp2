package com.epicode.BlogApp2.mapper;

import com.epicode.BlogApp2.DTO.BlogPostDTO;
import com.epicode.BlogApp2.model.BlogPost;
import org.springframework.stereotype.Component;

@Component
public class BlogPostMapperDTO {

    public static BlogPostDTO toDTO(BlogPost blogPost){
        BlogPostDTO blogPostDTO = new BlogPostDTO();
        blogPost.setTitolo(blogPost.getTitolo());
        blogPost.setContenuto(blogPost.getContenuto());
        blogPost.setCategoria(blogPost.getCategoria());
        blogPost.setTempodDiLettura(blogPost.getTempodDiLettura());
        blogPost.setAutore(blogPost.getAutore());
        return blogPostDTO;
    }

    public BlogPost toEntity(BlogPostDTO blogPostDTO){
        BlogPost blogPost = new BlogPost();
        blogPost.setTitolo(blogPostDTO.getTitolo());
        blogPost.setContenuto(blogPostDTO.getContenuto());
        blogPost.setCategoria(blogPostDTO.getCategoria());
        blogPost.setTempodDiLettura(blogPostDTO.getTempoDiLettura());
        blogPost.setAutore(blogPost.getAutore());
        return blogPost;

    }
}
