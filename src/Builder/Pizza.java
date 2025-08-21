package Builder;

public class Pizza {
    private final String massa;
    private final String molho;
    private final String queijo;
    private final boolean pepperoni;
    private final boolean cebola;
    private final boolean azeitona;


    public Pizza(Builder builder) {
        this.massa = builder.massa;
        this.molho = builder.molho;
        this.queijo = builder.queijo;
        this.pepperoni = builder.pepperone;
        this.cebola = builder.cebola;
        this.azeitona = builder.azeitona;
    }
    @Override
    public String toString() {
        return "Pizza com [Massa: " + massa + ", Molho: " + molho + ", Queijo: " + queijo + ", Pepperoni: " + pepperoni + ", Cebola: " + cebola + ", Azeitona: " + azeitona + "]";

    }

    public static class Builder {
        private String massa = "Fina";
        private String molho = "Tomate";
        private String queijo = "Muçarela";
        private boolean pepperone = false;
        private boolean cebola = false;
        private boolean azeitona = false;

        //Métodos encadeavéis para configurar a pizza
        public Builder comMassa(String massa) {
            this.massa = massa;
            return this;
        }
        public Builder comMolho(String molho) {
            this.molho = molho;
            return this;
        }
        public Builder comQueijo(String queijo) {
            this.queijo = queijo;
            return this;
        }
        public Builder comPepperone() {
            this.pepperone = true;
            return this;
        }
        public Builder comCebola() {
            this.cebola = true;
            return this;
        }
        public Builder comAzeitona() {
            this.azeitona = true;
            return this;
        }

        public Pizza createPizza(){
            return new Pizza(this);
        }


    }
}

