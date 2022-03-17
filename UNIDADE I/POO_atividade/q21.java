package POO_atividade;
/*
Escolha um esporte e um campeonato desse esporte. Crie um modelo para 
representar um time nesse campeonato. ESCOLHIDO: FUTEBOL
*/
public class q21 {
    //modelo simples para nome do time, localização do estadio, de qual estado o time é e a
    //quantidade de jogadores que tem o time
    private String nomeTime;
    private String estadio;
    private String estado;
    private int qtdjogadores;
    
    public q21(String nomeTime, String estadio, String estado, int qtdjogadores){
        this.nomeTime =nomeTime;
        this.estadio =estadio;
        this.estado = estado;
        this.qtdjogadores =qtdjogadores;
    }
    
    public String getNomeTime(){
        return nomeTime;
    }
    public void setNomeTime(String nomeTime){
        this.nomeTime = nomeTime;
    }
    public String getEstadio(){
        return estadio;
    }
    public void setEstadio(String estadio){
        this.estadio =estadio;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public int getQtdJogadores(){
        return qtdjogadores;
    }
    public void  setQtdjogadores(int qtdjogadores){
        this.qtdjogadores = qtdjogadores;
    }
}
