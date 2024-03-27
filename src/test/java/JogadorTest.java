
import org.example.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class JogadorTest {

    @Test
    public void testCalcularPrecoMercadoSerieA() {
        Liga ligaInglesa = new LigaInglesa();
        Jogador jogadorA = new JogadorSerieA(ligaInglesa, "Harry Maguire",32);
        assertEquals(14840000.0, jogadorA.calcularPrecoMercado(), 0.01);

        Liga ligaBrasileira = new LigaBrasileira();
        Jogador jogadorB = new JogadorSerieA(ligaBrasileira, "Payet",36);
        assertEquals(3820000.0, jogadorB.calcularPrecoMercado(), 0.01);

        Liga ligaPortuguesa = new LigaPortuguesa();
        Jogador jogadorC = new JogadorSerieA(ligaPortuguesa, "Marcos Leonardo",22);
        assertEquals(7890000.0, jogadorC.calcularPrecoMercado(), 0.01);
    }

    @Test
    public void testCalcularPrecoMercadoSerieB() {
        Liga ligaInglesa = new LigaInglesa();
        Jogador jogadorA = new JogadorSerieB(ligaInglesa, "Jobson",25);
        assertEquals(7375000.0, jogadorA.calcularPrecoMercado(), 0.01);

        Liga ligaBrasileira = new LigaBrasileira();
        Jogador jogadorB = new JogadorSerieB(ligaBrasileira, "Jobson",30);
        assertEquals(1850000.0, jogadorB.calcularPrecoMercado(), 0.01);

        Liga ligaPortuguesa = new LigaPortuguesa();
        Jogador jogadorC = new JogadorSerieB(ligaPortuguesa, "Jobson",22);
        assertEquals(3890000.0, jogadorC.calcularPrecoMercado(), 0.01);
    }

    @Test
    public void testCalcularPrecoMercadoSerieC() {
        Liga ligaInglesa = new LigaInglesa();
        Jogador jogadorA = new JogadorSerieC(ligaInglesa, "Jobson",25);
        assertEquals(1375000.0, jogadorA.calcularPrecoMercado(), 0.01);

        Liga ligaBrasileira = new LigaBrasileira();
        Jogador jogadorB = new JogadorSerieC(ligaBrasileira, "Jobson",30);
        assertEquals(250000.0, jogadorB.calcularPrecoMercado(), 0.01);

        Liga ligaPortuguesa = new LigaPortuguesa();
        Jogador jogadorC = new JogadorSerieC(ligaPortuguesa, "Jobson",22);
        assertEquals(690000.0, jogadorC.calcularPrecoMercado(), 0.01);
    }
}
