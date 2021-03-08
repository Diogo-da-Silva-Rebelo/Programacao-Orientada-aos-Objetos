package ficha2;

import ficha1.Ficha1;

import java.util.Arrays;
import java.util.Scanner;

public class TestePrograma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c1 = 'S';

        while (c1 != 'N') {
            System.out.println("Introduza o nº da pergunta: ");
            int pergunta = input.nextInt();

            // Como vamos ler sempre arrays, porque não criar um método que faça isso na classe Ficha2?
            switch (pergunta) {
                case 1:
                    //1
                    Ex1 ex1 = new Ex1();
                    int[] array = ex1.getArray();
                    int min = ex1.minArray(array);
                    System.out.println("O menor elemento do array é: " + min);

                    System.out.println("Introduza os dois índices do array: ");
                    int a = input.nextInt(), b = input.nextInt();
                    int[] betweenArray = ex1.betweenArray(array, a, b);
                    System.out.println("O novo array dimensionado é: " + Arrays.toString(betweenArray));

                    System.out.println("Introduza o 2º array: ");
                    int[] array2 = ex1.getArray();
                    int[] compatibleArray = ex1.sameArray(array, array2);
                    System.out.println("O novo array compatível é: " + Arrays.toString(compatibleArray));

                    //ordenação do array com a interseção dos dois arrays anteriores
                    ex1.sortArray(compatibleArray);
                    break;

                case 2:
                    //2
                    Scanner input2 = new Scanner(System.in);
                    int i = 0;
                    Ex2 ex2 = new Ex2();
                    Ex1 p2 = new Ex1();

                    int[][] notasTurma = {{10,12,16,11,19},
                                          {10,10,10,10,10},
                                          {11,12,13,14,15},
                                          {8,9,12,7,5},
                                          {7,6,4,18,15}};


                    ex2.atualizaPauta(notasTurma);

                    System.out.println("Selecione o índice da UC [0 a 4] sobre a qual quer saber a soma ds notas: ");
                    int UC = input2.nextInt();
                    int sumUc = ex2.somaUC(UC);
                    float mediaUc = ex2.mediaNotasUc(UC);
                    System.out.printf("A soma e média das notas da UC selecionada são: %d e %f", sumUc, mediaUc);

                    System.out.println("Selecione o aluno [0 a 4] sobre o qual quer saber a média das notas: ");
                    int aluno = input2.nextInt();
                    float mediaAluno = ex2.mediaNotasAluno(aluno);
                    System.out.println("A média das notas do aluno selecionado é: " + mediaAluno);

                    int notaMaxima = ex2.notaMax();
                    int notaMinima = ex2.notaMin();
                    System.out.printf("A nota mais alta e mais baixa da pauta são: %d %d ", notaMaxima, notaMinima);


                    System.out.println("Pretendo ver as notas acima do valor:");
                    int valorlimite = input.nextInt();
                    int[] acima = ex2.notasAcimaDe(valorlimite);
                    System.out.println("O array dessas notas é: " + Arrays.toString(acima));


                    int indexMax = ex2.indMaxUc();
                    System.out.println("O índice da UC com maior média é: " + indexMax);
                    break;

                default:
                    System.out.println("Input inválido.");
            }

            System.out.println("Deseja fazer outra pergunta? [S/N] ");
            Scanner careter = new Scanner(System.in);
            c1 = careter.next().charAt(0);
        }
    }
}
