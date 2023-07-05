import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite sua altura em metros: ");
            double altura = leia.nextDouble();

            System.out.print("Digite seu peso em quilogramas: ");
            double peso = leia.nextDouble();

            double imc = peso / (altura * altura);

            System.out.println("Seu índice de massa corporal (IMC) é: " + imc);
        }
    }
}