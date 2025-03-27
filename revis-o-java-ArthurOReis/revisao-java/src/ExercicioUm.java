import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int ano_atual, ano_nascimento, idade;

        System.out.print("Entre com o seu nome: ");
        nome = input.nextLine();

        System.out.print("Entre com o ano que nasceu: ");
        ano_nascimento = input.nextInt();

        System.out.print("Entre com o ano atual: ");
        ano_atual = input.nextInt();

        idade = ano_atual - ano_nascimento;

        System.out.printf("%s, possui %d anos.", nome, idade);
    }
}