public class AdicionalLeiteEmPo extends AcaiDecorator{
    public AdicionalLeiteEmPo(Acai acai) {
        super(acai);
    }
    public float getPrecoAcompanhamento() {
        return 2;
    }
    public String getAcompanhamentos() {
        return "Leite em Pó";
    }
}
