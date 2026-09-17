package padroescriacao.abstractfactory;

public class FabricaLinux implements FabricaAbstrata {

    @Override
    public Botao criarBotao() {
        return new BotaoLinux();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaLinux();
    }
}