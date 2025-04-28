package com.mycodebox.api.controller;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.mycodebox.api.dto.ContatoDto;

@Service
public class ContatoService implements ContatoInterfaceService {


    KafkaTemplate<Object, Object>   kafkaTemplate;


    public ContatoService( KafkaTemplate<Object, Object>   kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void enviarContato(String topico, Object dados){

        this.kafkaTemplate.send(topico, dados);

    }

}
