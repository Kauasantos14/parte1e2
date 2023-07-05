import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        double dolar, real;
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o valor em dólar: ");
            dolar = leia.nextDouble();
        }

        real = dolar * 4.79;
        System.out.println("US$" + dolar + " em reais fica " + real);
    }
}

