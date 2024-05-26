package org.classes;

public class Telefone {
    private String numeroTelefone;

    public Telefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        System.out.println("Inicializando telefone");
    }

    public void ligar(String numero){
        System.out.printf("Ligando para %s \n", numero);
    }

    public void atender(){
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Ouvindo correio de voz");
    }
}
