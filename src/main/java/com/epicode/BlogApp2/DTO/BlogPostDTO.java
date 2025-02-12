package com.epicode.BlogApp2.DTO;

import lombok.Data;

@Data
public class BlogPostDTO {

    private String categoria;
    private String titolo;
    private String contenuto;
    private Integer tempoDiLettura;
}
