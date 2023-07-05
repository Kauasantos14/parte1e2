import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de dias que o carro foi alugado: ");
            int diasAluguel = leia.nextInt();

            System.out.print("Digite o valor da diária: ");
            double valorDia = leia.nextDouble();

            double valorTotal = diasAluguel * valorDia;

            System.out.println("O valor total a ser pago do aluguel é: " + valorTotal);
        }
    }
}
