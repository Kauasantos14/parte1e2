import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {

        String rua, cidade, estado, nome;
        float numero;
        long cpf, cep, telefone;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite o endereço começando pelo seu estado: ");
        estado = leia.nextLine();

        System.out.println("Agora digite sua rua: ");
        rua = leia.nextLine();

        System.out.println("Digite sua cidade: ");
        cidade = leia.nextLine();

        System.out.println("Digite o número de sua casa/apartamento: ");
        numero = leia.nextFloat();

         System.out.println("Digite seu CEP (sem nenhuma pontuação) : ");
        cep = leia.nextLong(20);

        System.out.println("Agora digite seus dados pessoais começando pelo seu CPF (sem nenhuma pontuação): ");
        cpf = leia.nextLong(11);

        System.out.println("Por fim digite seu telefone, seguindo o exemplo (DD000000000) : ");
        telefone = leia.nextLong(20);

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: RUA " + rua + ", NUMERO: " + numero + ", CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);


    }
}
