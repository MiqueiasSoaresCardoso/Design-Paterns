package Uber_comFactoryMethod.FactoryMethod;

public class VeiculoFactory {
    // O método de criação que decide qual objeto instanciar
    public static IVeiculo criarVeiculo(int tipoVeiculo) {
        switch (tipoVeiculo) {
            case 1:
                return new UberX("João Fernandes", "Chevrolet", "Onix", "Branco", 4.2);
            case 2:
                return new UberComfort("João Fernandes", "Chevrolet", "Onix", "Preto", 4.8);
            case 3:
                return new UberFlash("Maria Antunes", "Hyundai", "HB20", "Azul", 4.5);
            default:
                throw new IllegalArgumentException("Tipo de veículo inválido.");
        }
    }
}