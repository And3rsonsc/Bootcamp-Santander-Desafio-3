package org.interfaces;

public interface ReprodutorMusical {

    default void tocar(){
        System.out.println("Tocando música");
    }

    default void pausar(){
        System.out.println("Pausando música");
    }

    default void selecionarMusica(String musica){
        System.out.printf("Música selecionada %s \n", musica);
    }
}
