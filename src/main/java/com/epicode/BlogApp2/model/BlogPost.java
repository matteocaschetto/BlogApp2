package com.epicode.BlogApp2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Entity(name= "blogposts")
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BlogPost {

    private Long id;
    private String categoria;
    private String titolo;
    private String cover = null;
    private String contenuto;
    private int tempodDiLettura;
    @ManyToOne
    @JoinColumn(name ="author_id", nullable = false)
    private Autore autore;
}
