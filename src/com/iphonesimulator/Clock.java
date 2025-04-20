package com.iphonesimulator;

import java.time.LocalTime;

public class Clock {

    private LocalTime alarme;

    public void definirAlarme(int hora, int minuto) {
        alarme = LocalTime.of(hora, minuto);
        System.out.println("Alarme definido para " + alarme);
    }

    public void mostrarHoraAtual() {
        System.out.println("Hora atual: " + LocalTime.now());
    }

    public void verificarAlarme() {
        if (alarme != null && LocalTime.now().getHour() == alarme.getHour()
                && LocalTime.now().getMinute() == alarme.getMinute()) {
            System.out.println("⏰ Alarme tocando!");
        }
    }
}
