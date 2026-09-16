package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;


import static org.junit.jupiter.api.Assertions.assertNotNull;
public class FabricaInterfaceTest {

    @Test
    void deveCriarComponentesWindows(){
        FabricaInterface fabricaInterface = new FabricaWindows();
        Botao botao = fabricaInterface.criarBotao();
        Janela janela = fabricaInterface.criarJanela();
        assertInstanceOf(BotaoWindows.class, botao);
        assertInstanceOf(JanelaWindows.class, janela);
    }

    @Test
    void deveCriarComponentesLinux(){
        FabricaInterface fabricaInterface = new FabricaLinux();
        Botao botao = fabricaInterface.criarBotao();
        Janela janela = fabricaInterface.criarJanela();
        assertInstanceOf(BotaoLinux.class, botao);
        assertInstanceOf(JanelaLinux.class, janela);
    }

    @Test
    void deveCriarComponentesNaoNulos(){
        FabricaInterface fabricaInterface = new FabricaWindows();
        Botao botao = new BotaoWindows();
        Janela janela = new JanelaWindows();
        assertNotNull(botao);
        assertNotNull(janela);
    }


}
