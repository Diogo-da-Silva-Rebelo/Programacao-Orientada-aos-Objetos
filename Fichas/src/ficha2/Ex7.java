package ficha2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Ex7 {
    private int[] numbers = new int[5];
    private int[] stars = new int[2];

    public void generateKey() {
        int[] randNumber = new int[5];
        int[] randStar = new int[2];

        for (int i=0;i<5;i++)
            randNumber[i]= ThreadLocalRandom.current().nextInt(1,50);
        System.arraycopy(randNumber,0,this.numbers,0,5);
        for (int j=0;j<2;j++)
            randStar[j]= ThreadLocalRandom.current().nextInt(1,9);
        System.arraycopy(randStar,0,this.stars,0,2);
    }

    public int[] readNumbers() {
        int[] userN = new int[5];

        System.out.println("Insert your numbers: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < 5; i++)
            userN[i] = n;
        return userN;
    }

    public int[] readStars() {
        int[] userS = new int[2];

        System.out.println("Insert your stars: ");
        Scanner p = new Scanner(System.in);
        int d = p.nextInt();
        for (int i = 0; i < 2; i++)
            userS[i] = d;
        return userS;
    }

    //corrigir
    public int[] compareNumbers(int[] numbers) {
        //store key or elements that are correct
        int[] correct = new int[5];
        int k = 0;
        for (int n: this.numbers) {
            for (int m: this.numbers) {
                if (numbers[k] == m)
                    correct[k] = m;
                    k++;
                    break;
            }
        }
        return correct;
    }
//corrigir
    public int[] compareStars(int[] stars) {
        int[] correct2 = new int[2];
        int l = 0;
        for (int h : this.stars) {
            for (int g : this.numbers) {
                if (stars[l] == g) {
                    correct2[l] = h;
                    l++;
                    break;
                }
            }
        }
        return correct2;
    }

    @Override
    public String toString() {
        return "Ex7{" +
                "numbers=" + Arrays.toString(numbers) +
                ", stars=" + Arrays.toString(stars) +
                '}';
    }
}
