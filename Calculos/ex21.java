import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua altura em metros: ");
        double altura = leia.nextDouble();

        System.out.println("Digite seu peso em quilogramas: ");
        double peso = leia.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu índice de massa corporeal (IMC) é: " + imc);

    }
}