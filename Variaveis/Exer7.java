import java.util.Scanner;
public class Exer7
{
    public static void main(String[] args)
    {
        String nome,cidade;
        int idade;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite sua cidade: ");
        cidade = leia.nextLine();

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.println("Olá " + nome + " você possui " + idade + " anos e mora na cidade " + cidade);
    }
}