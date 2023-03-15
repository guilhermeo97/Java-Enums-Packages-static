import enumerators.DinheiroEnum;
import enumerators.SemanaEnum;

public class Enums {
    public static void main(String[] args) throws Exception {
        SemanaEnum folga = SemanaEnum.DOMINGO;
        System.out.println(folga);
        DinheiroEnum nota1 = DinheiroEnum.LOBO;
        DinheiroEnum nota2 = DinheiroEnum.ONCA;
        System.out.println(nota1);
        System.out.println(nota1.getValue() + nota2.getValue());
    }
}


