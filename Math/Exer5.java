import java.util.*;
public class Exer5 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a hipotenusa do triãngulo: ");
        double hipo = leia.nextDouble();

        System.out.println("Digite o cateto oposto do0 triãngulo: ");
        double oposto = leia.nextDouble();

        double adjacente = Math.sqrt(Math.pow(hipo, 2) – Math.pow(oposto, 2));
        
    }
    
}

