import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto: ");
            double valorProduto = leia.nextDouble();

            double acrescimo = 0.15;
            double valorComAcresci = valorProduto + (valorProduto * acrescimo);

            System.out.println("O valor com acréscimo é: " + valorComAcresci);
        }
    }
}

