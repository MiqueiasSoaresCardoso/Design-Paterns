package Decorator;

public class EspadadeFerro extends ItemDecorator {

    public EspadadeFerro(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " Com Espada Ferro";
    }

    @Override
    public double getDano(){
        return super.getDano() + 50.00;
    }
}
