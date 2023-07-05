import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double ladoQuadrado, areaQuadrado;

        System.out.println("Digite um lado do quadrado: ");
        ladoQuadrado = leia.nextDouble();

        areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.println("A área do quadrado é " + areaQuadrado);

    }
}
