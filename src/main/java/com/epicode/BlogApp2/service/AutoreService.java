package com.epicode.BlogApp2.service;



import com.epicode.BlogApp2.DTO.AutoreDTO;
import com.epicode.BlogApp2.model.Autore;
import com.epicode.BlogApp2.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


import static com.epicode.BlogApp2.mapper.AutoreMapperDTO.toEntity;

@Service
public class AutoreService {
    @Autowired
    AutoreRepository autoreRepository;


    public Long nuovoAutore(AutoreDTO nuovoAutoreDto){
        Autore autoreInserito =  toEntity(nuovoAutoreDto);
        return autoreRepository.save(autoreInserito).getId();
    }

    public Optional<Autore> ricercaAutoreId(Long id){
        Optional<Autore> autoreRecuperato = autoreRepository.findById(id);
        return autoreRecuperato;
    }
}
