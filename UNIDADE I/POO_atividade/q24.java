package POO_atividade;

/*
Crie um modelo que represente uma reserva em uma pousada.

*/
public class q24 {
    private String nomePessoa;
    private int qtdDias;
    private String formaPagamento;
    private int nQuarto;
    private int qtdCamas;

    public q24(String nomePessoa, int qtdDias, String formaPagamento, int nQuarto, int qtdCamas) {
        this.nomePessoa = nomePessoa;
        this.qtdDias = qtdDias;
        this.formaPagamento = formaPagamento;
        this.nQuarto = nQuarto;
        this.qtdCamas = qtdCamas;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getnQuarto() {
        return nQuarto;
    }

    public void setnQuarto(int nQuarto) {
        this.nQuarto = nQuarto;
    }

    public int getQtdCamas() {
        return qtdCamas;
    }

    public void setQtdCamas(int qtdCamas) {
        this.qtdCamas = qtdCamas;
    }

}
