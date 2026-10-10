package com.example.servidores.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;


import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentacaoController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> obterDocumentacao() {
        try{
            ClassPathResource arquivo = new ClassPathResource("documentacao.json");
            byte[] bytes = arquivo.getInputStream().readAllBytes();
            String json = new String(bytes, StandardCharsets.UTF_8);

            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(json);
        } catch (IOException erro) {
            return ResponseEntity.internalServerError()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"erro\": \"Não foi possível ler o arquivo documentacao.json\"}");
        }
    }
}

