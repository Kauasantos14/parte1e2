import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número inteiro:");
            int numero1 = leia.nextInt();

            System.out.println("Digite o segundo número inteiro:");
            int numero2 = leia.nextInt();

            int soma = numero1 + numero2;

            System.out.println("A soma dos números é: " + soma);
        }
    }}