import java.util.*;
public class Exer2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        double num = leia.nextDouble();

        double cima = Math.ceil(num);
        double baixo = Math.floor(num);

        System.out.println("A)" + num + " arredondado para cima fica " + cima);

        System.out.println("********************************************");

        System.out.println("B) " + num + " arredondado para baixo fica " + baixo);

        System.out.println("********************************************");

        double aleatorio = Math.random();
        System.out.println("C) O número gerado aleatório foi " + aleatorio);

        System.out.println("********************************************");

        System.out.println("Digite um valor: ");
        double valor = leia.nextDouble();
        double abso = Math.abs(valor);
        System.out.println("D) O valor absoluto de " + valor + " é " + abso);

        System.out.println("********************************************");

        System.out.println("Digite o valor um:");
        int vlr1= leia.nextInt();
        System.out.println("Digite o valor dois:");
        int vlr2= leia.nextInt();

        double max = Math.max(vlr1, vlr2);
        double min = Math.min(vlr1, vlr2);

        System.out.println("E) o valor maximo é " + max );

        System.out.println("********************************************");
        System.out.println("F) o valor minimo é " + min );

        System.out.println("********************************************");

        System.out.println("Digite um angulo");
        double ang = leia.nextDouble();

        double sen = Math.sin(ang);
        
        double senRad = Math.toRadians(sen);
        
        double cos = Math.cos(ang);
        
        double cosRad = Math.toRadians(cos);
        
        System.out.println("G)o seno em radianos é: " + senRad);

        System.out.println("********************************************");
        
        System.out.println("H)o cosseno em radianos é: " + cosRad);

        System.out.println("********************************************");
        





        
    }
}
