import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = leia.nextInt();

            int cubo = numero * numero * numero;

            System.out.println("O cubo de " + numero + " é: " + cubo);
        }
    }
}
        
