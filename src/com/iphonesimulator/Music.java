package com.iphonesimulator;

public class Music {
    private String titulo;
    private String artista;
    private int duracao;

    public Music(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public Music() {
        this("Desconhecida", "Desconhecido", 0);
    }

    public void play() {
        System.out.println("Tocando: " + titulo + " - " + artista);
    }

    public void stop() {
        System.out.println("Parando música...");
    }
}
