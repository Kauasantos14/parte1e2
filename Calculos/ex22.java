import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        int n1, n2;
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            n1 = leia.nextInt();
            
            System.out.println("Digite o segundo número: ");
            n2 = leia.nextInt();
        }
         
        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " é maior que " + n1);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
        

