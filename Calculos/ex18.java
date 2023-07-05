import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) {

        int idade, anoNasc, anoAtual;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        leia.nextLine();

        System.out.println("Digite o ano em que estamos: ");
        anoAtual = leia.nextInt();
        leia.nextLine();

        anoNasc = anoAtual - idade;

        System.out.println("Você nasceu em " + anoNasc);


    }
}