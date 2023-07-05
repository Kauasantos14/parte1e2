import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {

        int idade, meses, diasVividos;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.println("Digite a quantidade de meses em que você viveu: ");
        meses = leia.nextInt();

        diasVividos = meses * 30;

        System.out.println("Você viveu aproximadamente " + diasVividos + " dias.");



    }
}
