import java.util.*;
public class Exer1 {
    public static void main(String[] args) {

        double x1, x2, y1, y2,part1, part2, resul;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite X1: ");
        x1 = leia.nextDouble();

        System.out.println("Digite X2: ");
        x2 = leia.nextDouble();

        System.out.println("Digite Y1: ");
        y1 = leia.nextDouble();

        System.out.println("Digite Y2: ");
        y2 = leia.nextDouble();

        part1 = Math.pow(x2 - x1, 2);

        part2 = Math.pow(y2 - y1, 2);

        resul = Math.sqrt(part1 + part2);

        System.out.println("O resultado final é: " + resul);

    }
}