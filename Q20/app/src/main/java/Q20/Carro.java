package Q20;

public class Carro {

    private int ano;
    private float valor;
    public Carro()
    {
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float Desconto() {
        float desconto;
        if (this.ano > 2000) {
            desconto = 0.07f;

        } else {
            desconto = 0.12f;
        }
        return desconto * valor;
    }
    public float ValorFinal()
    {
        return valor - Desconto();
    }
}
