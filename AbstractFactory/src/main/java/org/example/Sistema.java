package org.example;

public class Sistema {

    public static void main(String[] args) {

        FabricaInterface fabricaWindows = new FabricaWindows();
        Botao botaoWindows = fabricaWindows.criarBotao();
        Janela janelaWindows = fabricaWindows.criarJanela();

        janelaWindows.renderizar();
        botaoWindows.renderizar();


        FabricaInterface fabricaLinux = new FabricaWindows();
        Botao botaoLinux = fabricaLinux.criarBotao();
        Janela janelaLinux = fabricaLinux.criarJanela();

        janelaWindows.renderizar();
        botaoWindows.renderizar();

    }
}