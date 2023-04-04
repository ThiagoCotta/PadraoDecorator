public class AdicionalMorango extends AcaiDecorator {
    public AdicionalMorango(Acai acai) {
        super(acai);
    }
    public float getPrecoAcompanhamento() {
        return 3;
    }
    public String getAcompanhamentos() {
        return "Morango";
    }
}
