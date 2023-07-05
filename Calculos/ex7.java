import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = leia.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = leia.nextInt();

            int resultado = numero1 * numero2;

            System.out.println("O resultado da multiplicação é: " + resultado);
        }
    }
}

