package org.main;

import org.classes.Iphone2007;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone2007 iphone = new Iphone2007("47988681743");

        iphone.ligar("9986786");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();

        iphone.selecionarMusica("Lady Gagá");
        iphone.tocar();
        iphone.pausar();

    }
}