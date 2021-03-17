package ficha2;
import java.time.LocalDate;
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
                    Ex2 ex2 = new Ex2();

                    ex2.inicializaPauta();

                    int[][] notasTurma = {
                            {10,12,16,11,19},
                            {10,10,10,10,10},
                            {11,12,13,14,15},
                            {8 ,9 ,12, 7, 5},
                            {7 ,6 ,4 ,18,15}
                    };

                    ex2.atualizaPauta(notasTurma);
                    System.out.println("Array é : "+ Arrays.deepToString(notasTurma) + "\n");
                    ex2.mostraString();

                    System.out.println("Selecione o índice da UC [0 a 4] sobre a qual quer saber a soma das notas: ");
                    int UC = input2.nextInt();
                    int sumUc = ex2.somaUC(UC);
                    float mediaUc = ex2.mediaNotasUc(UC);

                    System.out.printf("A soma e média das notas da UC selecionada são: %d e %f\n\n", sumUc, mediaUc);

                    System.out.println("Selecione o aluno [0 a 4] sobre o qual quer saber a média das notas: ");
                    int aluno = input2.nextInt();
                    float mediaAluno = ex2.mediaNotasAluno(aluno);
                    System.out.println("A média das notas do aluno selecionado é: " + mediaAluno);

                    int notaMaxima = ex2.notaMax();
                    int notaMinima = ex2.notaMin();
                    System.out.printf("A nota mais alta e mais baixa da pauta são: %d e %d\n\n", notaMaxima, notaMinima);


                    System.out.println("Pretendo ver as notas acima do valor:");
                    int valorlimite = input.nextInt();
                    int[] acima = ex2.notasAcimaDe(valorlimite);
                    System.out.println("O array dessas notas é: " + Arrays.toString(acima) + "\n");


                    //calcular media de cada UC e dar o indice maior
                    int indexMax = ex2.ucMediaMaior();
                    System.out.println("O índice da UC com maior média é: " + indexMax);

                    break;
                case 3:
                    //3
                    Ex3 ex3 = new Ex3(4);

                    //Inserção
                    ex3.insereDatas(LocalDate.now());
                    System.out.println("Inserção da data de hoje.");
                    ex3.insereDatas(LocalDate.of(2021,10,2));
                    System.out.println("Inserção da data 02-10-2021.");
                    ex3.insereDatas(LocalDate.of(2021,11,2));
                    System.out.println("Inserção da data 02-11-2021.");
                    ex3.insereDatas(LocalDate.of(2001,1,19));
                    System.out.println("Inserção da data de aniverśario do Purp.");

                    //Cálculo da data mais próxima do aniverśario do Purp
                    LocalDate datamProx = ex3.dataMaisProxima(LocalDate.of(2021,1,19));
                    System.out.println("A data mais próxima do aniv do Purp é: " + datamProx.toString());

                    System.out.println("\nO array de datas inseridas é: " + ex3.toString() + "\n");
                    break;
                case 4:
                    //4
                    Scanner x = new Scanner(System.in);

                    int[] experiment = {10,42,45,87,567,172,129,116,114,166};
                    Ex4 ex4 = new Ex4(experiment);

                    System.out.println("O seu array ordenado é: " + Arrays.toString(ex4.ordena()));
                    System.out.println("Introduza o elemento a procurar: ");
                    int elem = x.nextInt();
                    System.out.println("Busca Binária \n " +
                            "[Valor negativo? Não existe]\n " +
                            "[Valor positivo? Índice]\n-> "+ ex4.procuraB(elem));
                    break;
                case 5:

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
