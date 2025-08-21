package Decorator;

//A Classe abstrata ela é por definição incompleta, ela pode escolher implementar apenas alguns métodos da interface
//Ou nenhum e delegar a responsabilidade de implementar o restante para as classes que a herdam

public abstract class ItemDecorator implements Personagem{
    protected Personagem personagem;

    public ItemDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    // O método getDescricao() é implementado, mas apenas para repassar a chamada
    @Override
    public String getDescricao() {
        return personagem.getDescricao();
    }

    // O método getDano() também é implementado apenas para repassar a chamada
    @Override
    public double getDano() {
        return personagem.getDano();
    }


}
