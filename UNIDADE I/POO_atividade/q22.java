package POO_atividade;
/*
Crie um modelo que represente os dados básicos de um livro de uma biblioteca,
que pode ser emprestado a leitores. 
*/
public class q22 {
    private String titulo;
    private String autor;
    private int qtdPags;
    private int anolancamento;

    public q22(String titulo, String autor, int qtdPags, int anolancamento){
        this.titulo = titulo;
        this.autor = autor;
        this.qtdPags = qtdPags;
        this.anolancamento = anolancamento;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getQtdPags() {
        return qtdPags;
    }
    public void setQtdPags(int qtdPags) {
        this.qtdPags = qtdPags;
    }
    public int getAnolancamento() {
        return anolancamento;
    }
    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }
    

}
