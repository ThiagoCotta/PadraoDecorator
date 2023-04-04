public class AdicionalLeiteCondensado extends AcaiDecorator {
    public AdicionalLeiteCondensado(Acai acai) {
        super(acai);
    }
    public float getPrecoAcompanhamento() {
        return 6;
    }
    public String getAcompanhamentos() {
        return "Leite Condensado";
    }
}
