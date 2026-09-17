package padroescriacao.abstractfactory;

public class FabricaWindows implements FabricaAbstrata {

    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaWindows();
    }
}