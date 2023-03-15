package enumerators;
public enum DinheiroEnum {
        BEIJAFLOR(1,"Beija-flor-de-peito-azul"),
        TARTARUGA(2, "Tartaruga-de-pente"),
        GARCA(5, "Garça-branca-grande"),
        ARARA(10, "Arara-vermelha-grande"),
        MICO(20, "Mico-leão-dourado"),
        ONCA(50, "Onça-pintada"),
        GAROUPA(100, "Garoupa"),
        LOBO(200, "Lobo-guará");
    
        private int value;
        private String animal;
    
        public String getAnimal() {
            return animal;
        }
    
        public int getValue() {
            return value;
        }
    
        private DinheiroEnum(int value, String animal){
            this.value = value;
            this.animal = animal;
        }
        
}
