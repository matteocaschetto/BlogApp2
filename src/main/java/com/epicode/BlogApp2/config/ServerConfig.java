package com.epicode.BlogApp2.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ServerConfig {

    @Bean
    public Cloudinary configurazioneCloud() {
        Map<String, String> configurazione = new HashMap<String, String>();
        configurazione.put("cloud_name", "dlo86p6cf");
        configurazione.put("api_key", "273447244923825");
        configurazione.put("api_secret", "QDfKqbQ2hY6dpa9AuS5QujQ3rwM");
        return new Cloudinary(configurazione);
    }

}
