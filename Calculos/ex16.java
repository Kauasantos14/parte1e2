import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto:");
            double valorProduto = leia.nextDouble();

            System.out.println("Digite a porcentagem do produto:");
            double porcentagemDesconto = leia.nextDouble();

            double valorDesconto = valorProduto * (porcentagemDesconto / 100);
            double valorComDesconto = valorProduto - valorDesconto;

            System.out.println("O valor com desconto é: " + valorComDesconto);
        }
    }
}
