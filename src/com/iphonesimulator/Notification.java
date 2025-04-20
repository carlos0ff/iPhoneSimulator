package com.iphonesimulator;

import java.util.ArrayList;
import java.util.List;

public class Notification {

    private List<String> notificacoes = new ArrayList<>();

    public void adicionarNotificacao(String texto) {
        notificacoes.add(texto);
        System.out.println("Nova notificação: " + texto);
    }

    public void mostrarNotificacoes() {
        System.out.println("Notificações:");
        for (String n : notificacoes) {
            System.out.println("🔔 " + n);
        }
    }

    public void limparNotificacoes() {
        notificacoes.clear();
        System.out.println("Notificações limpas.");
    }
}
