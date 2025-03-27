import java.util.Arrays;
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

        String[] notas_str = notas_alunos.split(" ");

        if (notas_str.length != quantidade_alunos) {
            System.out.println("Erro: O número de notas não corresponde à quantidade de alunos.");
            return;
        }

        int[] notas = Arrays.stream(notas_str)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] categorias = new int[4];

        for (int nota : notas) {
            if (nota <= 2) categorias[0]++;
            else if (nota <= 5) categorias[1]++;
            else if (nota <= 8) categorias[2]++;
            else categorias[3]++;
        }

        System.out.println("\nDistribuição das Notas:");
        System.out.println("0 − 2  | " + "*".repeat(categorias[0]));
        System.out.println("3 − 5  | " + "*".repeat(categorias[1]));
        System.out.println("6 − 8  | " + "*".repeat(categorias[2]));
        System.out.println("9 − 10 | " + "*".repeat(categorias[3]));

        input.close();
    }
}
