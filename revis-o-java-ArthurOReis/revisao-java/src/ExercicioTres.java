import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade_alunos;

        System.out.print("Entre com a quantidade de alunos: ");
        quantidade_alunos = input.nextInt();
        input.nextLine();

        System.out.print("Entre com a nota dos alunos separadas por espaço: ");
        String notas_alunos = input.nextLine();

        String[] notas = notas_alunos.split(" ");


    }
}
