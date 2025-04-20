package com.iphonesimulator;

import java.util.ArrayList;
import java.util.List;

public class Message {
    private List<String> historico = new ArrayList<>();

    public void enviarMensagem(String numero, String conteudo) {
        historico.add("Enviado para " + numero + ": " + conteudo);
        System.out.println("Mensagem enviada para " + numero);
    }

    public void receberMensagem(String numero, String conteudo) {
        historico.add("Recebido de " + numero + ": " + conteudo);
        System.out.println("Nova mensagem recebida de " + numero);
    }

    public void mostrarHistorico() {
        System.out.println("Histórico de mensagens:");
        for (String msg : historico) {
            System.out.println(msg);
        }
    }
}
