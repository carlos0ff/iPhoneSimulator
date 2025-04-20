package com.iphonesimulator;

public class Call {
    private String numero;
    private int duracao;
    private String status;

    public Call(String numero) {
        this.numero = numero;
        this.duracao = 0;
        this.status = "Finalizada";
    }

    public void fazerChamada() {
        status = "Em andamento";
        System.out.println("Chamando: " + numero);
    }

    public void atenderChamada() {
        status = "Atendida";
        System.out.println("Chamada atendida.");
    }

    public void finalizarChamada() {
        status = "Finalizada";
        System.out.println("Chamada finalizada.");
    }
}
