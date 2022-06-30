package QPOO6;

public class Invoice {

    private int nitem;
    private String descricao;
    private int qtditem;
    private float precounit;

    public Invoice(int nitem, String descricao, int qtditem, float precounit) {
        this.setNitem(nitem);
        this.setDescricao(descricao);
        this.setQtditem(qtditem);
        this.setPrecounit(precounit);
    }

    public int getNitem() {
        return nitem;
    }

    public void setNitem(int nitem) {
        this.nitem = nitem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtditem() {
        return qtditem;
    }

    public void setQtditem(int qtditem) {
        if (qtditem < 0) {
            this.qtditem = 0;
        } else {
            this.qtditem = qtditem;
        }
    }

    public float getPrecounit() {
        return precounit;
    }

    public void setPrecounit(float precounit) {
        if (precounit < 0) {
            this.precounit = 0.0f;

        } else {
            this.precounit = precounit;
        }
    }

    public double getInvoiceAmount() {
        return qtditem * precounit;
    }
}
