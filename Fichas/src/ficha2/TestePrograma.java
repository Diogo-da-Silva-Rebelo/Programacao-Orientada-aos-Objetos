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

                    break;

                case 3:
                    //3

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
