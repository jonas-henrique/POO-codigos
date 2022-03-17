package POO_atividade;
/*
Escreva um modelo para representar uma lâmpada que está à venda em um supermercado.
*/
public class q20 {
    private String nome;
    private String marca;
    private float preco;
    private int voltagem;
    private int capacidade;

    public q20(String nome, String marca, float preco, int voltagem, int capacidade){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
        this.capacidade = capacidade;
    }
    //getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }
    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public int getVoltagem(){
        return voltagem;
    }
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
 
}
