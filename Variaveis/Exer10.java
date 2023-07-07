import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double X;

        System.out.println("Digite o valor de A: ");
        double A = leia.nextDouble();

        System.out.println("Digite o valor de B: ");
        double B = leia.nextDouble();

        X = A;
        A = B;
        B = X;

        System.out.println("Agora A vale " + A + " e B vale " + B);
    }
}
