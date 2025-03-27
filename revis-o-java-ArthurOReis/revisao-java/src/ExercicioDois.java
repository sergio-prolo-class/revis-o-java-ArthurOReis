//Na disciplina de POO o aluno será avaliado
//por meio de 2 projetos práticos (p) e pela participação nas aulas (a). A
//nota para os projetos práticos é calculada por meio de uma média
//ponderada, com os seguintes pesos W = {w1, w2} = {2, 3}. O Conceito
//Final (CF) é calculado por meio de uma média ponderada, os projetos com
//peso 0,9 e a participação nas aulas com peso 0,1. Sendo assim, o Conceito
//Final (CF) se dará por meio da Equação 1:

//Desenvolva um aplicativo em Java que permita receber, como
//argumentos de linha de comando, as notas dos 2 projetos práticos e da
//participação na aula e depois imprima na tela o conceito final e a palavra
//APROVADO, caso o CF ≥ 6 ou REPROVADO, caso contrário.

public class ExercicioDois {
    public static void main(String[] args) {
        int[] conceitos = new int[3];
        double[] pesos = {2.0, 3.0};
        int i = 0;

        for(String argumento: args){
            conceitos[i] = Integer.parseInt(argumento);
            i++;
        }

        double somatoria = 0;
        for(int j = 0; j < 2; j++){
            somatoria += (conceitos[j] * pesos[j]/pesos[j]);
        }

        somatoria *= 0.9;
        double notaFinal = somatoria + (conceitos[2] * 0.1);

        if (notaFinal >= 6.0) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
