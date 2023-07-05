import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Digite o valor do produto: ");
            double valorProduto = leia.nextDouble();

            System.out.println("Digite a quantidade de parcelas desejada: ");
            int quantParcelas = leia.nextInt();

            double valorParcela = valorProduto / quantParcelas;

            System.out.println("O valor de cada parcela é:" + valorParcela );
        }
    }
}