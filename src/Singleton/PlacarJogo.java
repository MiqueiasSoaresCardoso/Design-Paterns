package Singleton;

public class PlacarJogo {

    private int pontuacao;

    //01 Construtor privado
    private PlacarJogo() {
        this.pontuacao = 0;
    }
    //02 Criar uma variavel para armazenar a unica instancia gerada
    private static PlacarJogo instance;
    //03 Criar um metodo estático de acesso publico
    public static PlacarJogo getInstance() {
        if(instance == null){
            instance = new PlacarJogo();
        }
        return instance;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }
    public int getPontuacao() {
        return this.pontuacao;
    }
}
