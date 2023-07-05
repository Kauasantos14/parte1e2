import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {

        String rua, cidade, estado, nome;
        float cpf, cep, telefone, numero;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite seu endereço começando pela rua: ");
        rua = leia.nextLine();

        System.out.println("Agora digite o número de sua casa/apartamento: ");
        numero = leia.nextFloat();

        System.out.println("Agora digite  seu CEP seguindo o exemplo : ");
        cep = leia.nextFloat();

        System.out.println("Digite sua cidade: ");
        cidade = leia.nextLine();

        System.out.println("Digite seu estado: ");
        estado = leia.nextLine();

        System.out.println("Digite seu CPF: ");
        cpf = leia.nextFloat();

        System.out.println("Digite seu telefone seguindo : ");
        telefone = leia.nextFloat();

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: RUA" + rua + ", NUMERO: " + numero + ", CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);


    }
}