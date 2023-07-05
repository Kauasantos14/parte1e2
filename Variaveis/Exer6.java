import java.util.Scanner;
public class Exer6
{
    public static void main(String[] args)
    {
        int n1,n2;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu primeiro número: ");
        n1 = leia.nextInt();

        System.out.println("Digite seu segundo número: ");
        n2 = leia.nextInt();

        System.out.println("Os números fornecidos foram " + n1 + " e " + n2);
    }
}