package com.meuapp.iphone.model;

import com.meuapp.iphone.AparelhoTelefonico;
import com.meuapp.iphone.NavegadorInternet;
import com.meuapp.iphone.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar(String numero) {

    }

    @Override
    public void atender() {
        System.out.println("chamada em voz");

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}
