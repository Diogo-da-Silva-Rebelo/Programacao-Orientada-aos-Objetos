package ficha3;

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
                /*
                //A pergunta 0 é a pergunta relativa ao exemplo da implementação da Stack.
                case 0:
                    Stack stk = new Stack();
                    System.out.println("Vazia? "+ stk.empty());

                    for (int i = 0; i<10; i++)
                        stk.push("String ".concat(Integer.toString(i)));

                    System.out.println("Vazia? "+stk.empty());
                    System.out.println("Tamanho stack "+ stk.length());
                    System.out.println("Top "+ stk.top());
                    System.out.println("Stack "+ stk);

                    Stack stk2 = stk.clone();
                    System.out.println("Stk == stk2 ? "+ stk.equals(stk2));
                    for (int i=0; i<5; i++) stk2.pop();

                    System.out.println("Stk == stk2 ? "+ stk.equals(stk2));
                    System.out.println("Tamanho stack1 "+ stk.length());
                    break; */
                case 1:
                    Ex1 c = new Ex1();
                    c.setRaio(1);
                    double p = c.calculaPerimetro();
                    System.out.println("Perímetro: " + p);
                    System.out.println(c);
                    c.alteraCentro(1, 1);
                    System.out.println(c);
                    double a = c.calculaArea();
                    System.out.println("Área: " + a);

                    Ex1 c2 = c.clone();
                    System.out.println(" c == c  ? " + c.equals(c));
                    System.out.println(" c == c2 ? " + c.equals(c2));
                    c2.setRaio(5);
                    System.out.println(" c == c2 ? " + c.equals(c2));
                    c.setRaio(5);
                    System.out.println(" c == c2 ? " + c.equals(c2));
                    break;
                case 2:
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
