import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de dias: ");
            int dias = leia.nextInt();

            System.out.print("Digite a quantidade de horas: ");
            int horas = leia.nextInt();

            System.out.print("Digite a quantidade de minutos: ");
            int minutos = leia.nextInt();

            System.out.print("Digite a quantidade de segundos: ");
            int segundos = leia.nextInt();

            int segundosPorDia = 24 * 60 * 60;
            int segundosPorHora = 60 * 60;
            int segundosPorMinuto = 60;

            int totalSegundos = (dias * segundosPorDia) + (horas * segundosPorHora) + (minutos * segundosPorMinuto) + segundos;

            System.out.println("O total de segundos é: " + totalSegundos);
        };
    }
}
