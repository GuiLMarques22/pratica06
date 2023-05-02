package Exercicio3;

import java.util.ArrayList;

public class Edicao {
    private int numero;
    private int volume;
    private String dataEdicao;
    private int triagem;
    private ArrayList<String> artigos;

    public Edicao(int numero, int volume, String dataEdicao, int triagem, ArrayList<String> artigos) {
        this.numero = numero;
        this.volume = volume;
        this.dataEdicao = dataEdicao;
        this.triagem = triagem;
        this.artigos = artigos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public int getTriagem() {
        return triagem;
    }

    public void setTriagem(int triagem) {
        this.triagem = triagem;
    }

    public ArrayList<String> getArtigos() {
        return artigos;
    }

    public void setArtigos(ArrayList<String> artigos) {
        this.artigos = artigos;
    }
    public void adicionarArtigos(String edicao){
        artigos.add(edicao);
    }
}
