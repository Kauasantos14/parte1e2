import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de horas trabalhadas em um dia: ");
            double horasTraba = scanner.nextDouble();

            System.out.print("Digite o valor da sua hora de trabalho: ");
            double valorH = scanner.nextDouble();

            double salarioDiario = horasTraba * valorH;

            System.out.println("O salário diário é: " + salarioDiario);
        }
    }
}
