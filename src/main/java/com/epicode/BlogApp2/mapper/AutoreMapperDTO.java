package com.epicode.BlogApp2.mapper;


import com.epicode.BlogApp2.DTO.AutoreDTO;
import com.epicode.BlogApp2.model.Autore;
import org.springframework.stereotype.Component;

@Component
public class AutoreMapperDTO {


    public static AutoreDTO toDTO(Autore autore){
        AutoreDTO autoreDto = new AutoreDTO();
        autoreDto.setNome(autore.getNome());
        autoreDto.setCognome(autoreDto.getCognome());
        autoreDto.setEmail(autore.getEmail());
        autoreDto.setDataDiNascita(autore.getDataDiNascita());
        return autoreDto;
    }
    public Autore toEntity(AutoreDTO autoreDto){
        Autore autore = new Autore();
        autore.setNome(autoreDto.getNome());
        autore.setCognome(autoreDto.getCognome());
        autore.setEmail(autoreDto.getEmail());
        autore.setDataDiNascita(autoreDto.getDataDiNascita());
        return autore;
    }

}

