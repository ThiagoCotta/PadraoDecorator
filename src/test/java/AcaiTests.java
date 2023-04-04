import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcaiTests {

    @Test
    void deveRetornarPrecoAcai() {
        Acai acai = new AcaiGrande(13);

        assertEquals(13, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComMorango() {
        Acai acai = new AdicionalMorango(new AcaiGrande(13));
        assertEquals(16, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComLeiteEmPo() {
        Acai acai = new AdicionalLeiteEmPo(new AcaiGrande(13));
        assertEquals(15, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComLeiteCondensado() {
        Acai acai = new AdicionalLeiteCondensado(new AcaiGrande(13));
        assertEquals(19, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComMorangoMaisLeiteEmPo() {
        Acai acai = new AdicionalMorango(new AdicionalLeiteEmPo(new AcaiGrande(13)));
        assertEquals(18, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComMorangoMaisLeiteCondensado() {
        Acai acai = new AdicionalMorango(new AdicionalLeiteCondensado(new AcaiGrande(13)));
        assertEquals(22, acai.getPreco());
    }

    @Test
    void deveRetornarPrecoAcaiComLeiteEmPoMaisLeiteCondensado() {
        Acai acai = new AdicionalLeiteEmPo(new AdicionalLeiteCondensado(new AcaiGrande(13)));
        assertEquals(21, acai.getPreco());
    }
}
