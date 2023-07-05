import java.util.Scanner;
public class Exer3
{
    public static void main(String[] args)
    {
        int idade;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.println("Sua idade é " + idade);
    }
}