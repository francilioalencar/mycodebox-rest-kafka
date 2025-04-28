package com.mycodebox.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycodebox.api.dto.ContatoDto;


@RestController
@RequestMapping("/contato")
public class ContatoController {
    

    private final ContatoInterfaceService contatoInterfaceService;


    public ContatoController(ContatoInterfaceService contatoInterfaceService){
        this.contatoInterfaceService = contatoInterfaceService;
    }

    @PostMapping
    ResponseEntity<Object> eviarSolicitacaoContato(@RequestBody ContatoDto contatoDto){

        this.contatoInterfaceService.enviarContato("enviar-contato", contatoDto);

        return ResponseEntity.ok("Ok");

    }


}
