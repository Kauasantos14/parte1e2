import java.util.*;
public class Exer3 
{
    public static void main(String[] args) 
    {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double vlr = leia.nextDouble();

        double tg = Math.toRadians(Math.tan(vlr));

        System.out.println("A) O valor " + vlr + " é " + tg);

        System.out.println("********************************************");

        System.out.println("Digite um valor: ");
        double vlrr = leia.nextDouble();

        double asen = Math.asin(vlrr);

        System.out.println("B) O arco do seno do valor " + vlrr + "  é " + asen);

        System.out.println("********************************************");

        double acos = Math.asin(vlrr);

        System.out.println("C) O arco do cosseno do valor " + vlrr + "  é " + acos);

        System.out.println("********************************************");

        double atg = Math.asin(vlrr);

        System.out.println("D) O arco da tangente do valor " + vlrr + "  é " + atg);

        System.out.println("********************************************");

        double nat = Math.log(vlrr);

        System.out.println("O valor natural do valor " + vlrr + " é " + nat);





    }
}