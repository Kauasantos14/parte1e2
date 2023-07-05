import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a quantidade de litros abastecidos: ");
            double litrosAbastecidos = scanner.nextDouble();

            System.out.println("Digite o valor do litro: ");
            Float valorLitro = scanner.nextFloat();

            double valorTotal = litrosAbastecidos * valorLitro;

            System.out.println("O valor total a ser pago é: " + valorTotal);
        }
    }
}
