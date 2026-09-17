package padroescriacao.abstractfactory;

public class Sistema {

    private Botao botao;
    private Janela janela;

    public Sistema(FabricaAbstrata fabrica) {
        this.botao = fabrica.criarBotao();
        this.janela = fabrica.criarJanela();
    }

    public String renderizarBotao() {
        return this.botao.renderizar();
    }

    public String renderizarJanela() {
        return this.janela.renderizar();
    }
}