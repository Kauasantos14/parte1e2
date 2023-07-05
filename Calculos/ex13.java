import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto: ");
            double valorProduto = leia.nextDouble();

            System.out.print("Digite a quantidade comprada: ");
            int quantComprada = leia.nextInt();

            double valorTotal = valorProduto * quantComprada;

            System.out.println("O valor total da compra é: " + valorTotal);
        }
    }
}
