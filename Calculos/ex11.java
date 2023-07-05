import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o numero inteiro :");
            int numero = leia.nextInt();

            int quadrado = numero * numero;
            System.out.println("O quadrado do numero é:" + quadrado);
        }
    }
}