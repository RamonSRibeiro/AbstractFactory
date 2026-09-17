package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {

    @Test
    void deveRenderizarBotaoLinux() {
        FabricaAbstrata fabrica = new FabricaLinux();
        Sistema sistema = new Sistema(fabrica);
        assertEquals("Botão Linux", sistema.renderizarBotao());
    }

    @Test
    void deveRenderizarBotaoWindows() {
        FabricaAbstrata fabrica = new FabricaWindows();
        Sistema sistema = new Sistema(fabrica);
        assertEquals("Botão Windows", sistema.renderizarBotao());
    }

    @Test
    void deveRenderizarJanelaLinux() {
        FabricaAbstrata fabrica = new FabricaLinux();
        Sistema sistema = new Sistema(fabrica);
        assertEquals("Janela Linux", sistema.renderizarJanela());
    }

    @Test
    void deveRenderizarJanelaWindows() {
        FabricaAbstrata fabrica = new FabricaWindows();
        Sistema sistema = new Sistema(fabrica);
        assertEquals("Janela Windows", sistema.renderizarJanela());
    }
}