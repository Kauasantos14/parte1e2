import java.util.Scanner;
public class Exer1 {
    public static void main(String[] args) {
        String nome , cidade;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite sua cidade: ");
        cidade = leia.nextLine();

        System.out.println("Olá " + nome + ", você mora na cidade de " + cidade);

    }
}