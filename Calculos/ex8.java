import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Digite o valor do produto: ");
            double valorProduto = leia.nextDouble();

            double desconto = 0.1;
            double valorComDesconto = valorProduto - (valorProduto * desconto);

            System.out.println("O valor com desconto é: " + valorComDesconto);
        }
    }
}
