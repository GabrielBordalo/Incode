package Arrays;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class Exercicios {

    public static void main(String[] args) {

        double[] notasAlunosA = new double[4];

        System.out.println(Arrays.toString(notasAlunosA));

        notasAlunosA[0] = 7.9;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 6.7;
        notasAlunosA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunosA));

        double total = 0;
        for (int i = 0; i < notasAlunosA.length; i++) {
            total += notasAlunosA[i];

            System.out.println(total / notasAlunosA.length);
        }

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        System.out.println(Arrays.toString(notasAlunoB));

        double total2 = 0;
        for (int a = 0; a < notasAlunoB.length; a++) {
            total2 += notasAlunoB[a];
        }
        System.out.println(total2 / notasAlunoB.length);
    }
}
