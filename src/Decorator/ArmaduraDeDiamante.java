package Decorator;

public class ArmaduraDeDiamante extends ItemDecorator{

    public ArmaduraDeDiamante(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao() + " Com Armadura de Diamante";
    }

    @Override
    public double getDano(){
        return super.getDano() + 10.00;
    }
}
