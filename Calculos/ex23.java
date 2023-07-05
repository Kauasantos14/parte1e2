import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        int num, i, resul;
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            num = leia.nextInt();
        }

        for (i = 1; i <= 10; i++) {
            resul = i * num;
            System.out.println(i + " x " + num + " = " + resul);
        }
    }
}







