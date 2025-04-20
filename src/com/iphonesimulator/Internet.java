package com.iphonesimulator;

public class Internet {

    /** **/
    private String url;

    /** **/
    private String pesquisa;

    /** **/
    private String resultado;

    /**
     *
     **/
    public Internet(String url) {
        this.url = url;
        this.pesquisa = "";
        this.resultado = "";
    }

    /**
     *
     **/
    public void abrirSite() {
        System.out.println("Abrindo site: " + url);
    }

    /**
     *
     **/
    public void pesquisar(String pesquisa) {
        this.pesquisa = pesquisa;
        System.out.println("Pesquisando: " + pesquisa);
    }

    /**
     *
     **/
    public void exibirResultado() {
        resultado = "Resultado da pesquisa: [simulação de resultados]";
        System.out.println(resultado);
    }
}
