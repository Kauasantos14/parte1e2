import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        int num;
        float nume;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num = leia.nextInt();

        System.out.println("Digite um número decimal: ");
        nume = leia.nextFloat();

        System.out.println("O número inteiro digitado foi " + num + " e o número decimal digitado foi " + nume);
    }
}