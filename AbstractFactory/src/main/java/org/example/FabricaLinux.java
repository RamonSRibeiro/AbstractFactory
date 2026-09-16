package org.example;

public class FabricaLinux implements FabricaInterface{
    @Override
    public Botao criarBotao() {
        return new BotaoLinux();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaLinux();
    }
}
