import java.util.*;
public class Exer4 
{
    public static void main(String[] args) 
    {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = leia.nextDouble();

        double are = Math.PI * Math.pow(raio, 2);

        System.out.println("A) A area do circulo é " + are);

        System.out.println("********************************************");

        double circu = 2 * Math.PI * raio;

        System.out.println("B) A circunferencia do círculo é " + circu);

        System.out.println("********************************************");

        System.out.println("Digite o cateto 1: ");
        double cat1 = leia.nextDouble();
        System.out.println("Digite o cateto 2: ");
        double cat2 = leia.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

        System.out.println("C) O valor da hipotenusa será de " + hipotenusa);

        System.out.println("********************************************");

        System.out.println("Digite a altura do rentangulo: ");
        double altura = leia.nextDouble();
        System.out.println("Digite o cumprimento do rentangulo: ");
        double cumprimento = leia.nextDouble();

        double perimetro = Math.pow(altura, 2) * Math.pow(cumprimento, 2);

        System.out.println("D) O perimetro do retangulo é " + perimetro);

        System.out.println("********************************************");

        System.out.println("Digite a base do triangulo");
        double base = leia.nextDouble();
        System.out.println("Digite a altura do triangulo");
        double alturaa = leia.nextDouble();

        double areatriangulo = (base * alturaa) / 2;

        System.out.println("E) A area do triangulo é " + areatriangulo);

        System.out.println("********************************************");





    }
}