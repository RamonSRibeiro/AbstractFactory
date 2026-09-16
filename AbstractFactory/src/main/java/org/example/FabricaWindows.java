package org.example;

public class FabricaWindows implements FabricaInterface{

    @Override
    public Botao criarBotao() {
        return new BotaoWindows() ;
    }

    @Override
    public Janela criarJanela() {
        return new JanelaWindows();
    }
}
