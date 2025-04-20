package com.iphonesimulator;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Calendar {

    private Map<LocalDate, String> eventos = new HashMap<>();

    public void adicionarEvento(LocalDate data, String descricao) {
        eventos.put(data, descricao);
        System.out.println("Evento adicionado em " + data + ": " + descricao);
    }

    public void mostrarEventos() {
        System.out.println("Eventos no calendário:");
        for (Map.Entry<LocalDate, String> e : eventos.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
