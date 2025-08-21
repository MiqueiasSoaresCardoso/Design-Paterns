package Builder;

public class Main3 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder()
                .comMassa("Grossa")
                .comPepperone()
                .comCebola()
                .comPepperone()
                .createPizza();
        System.out.println(pizza1.toString());
    }
}
