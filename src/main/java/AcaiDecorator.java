public abstract class AcaiDecorator implements Acai {
    private Acai acai;
    public String acompanhamento;

    public AcaiDecorator(Acai acai) {
        this.acai = acai;
    }

    public Acai getAcai() {
        return acai;
    }

    public void setAcai(Acai acai) {
        this.acai = acai;
    }

    public abstract float getPrecoAcompanhamento();

    public float getPreco() {
        return this.acai.getPreco() + this.getPrecoAcompanhamento();
    }

    public abstract String getAcompanhamentos();

    public String getAcompanhamento() {
        return this.acai.getAcompanhamento() + "/" + this.getAcompanhamentos();
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
}
