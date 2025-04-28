package com.mycodebox.api.dto;

public record ContatoDto(
    String email,
    String telefone,
    String mensagem,
    String assunto,
    String tipoMensagem
) {
    
}
