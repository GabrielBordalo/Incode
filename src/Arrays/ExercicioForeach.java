package Arrays;

import java.util.Arrays;

public class ExercicioForeach {
    public static void main(String[] args) {

        double[] notasAlunosA = {7.9, 8.0, 6.7, 9.7};
        //double[] notasAlunosA = new double[4];
       // notasAlunosA[0] = 7.9;
       // notasAlunosA[1] = 8;
        //notasAlunosA[2] = 6.7;
        //notasAlunosA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunosA));

        double total = 0;
        for (double nota : notasAlunosA) {
            System.out.println(nota);
            total += nota;
            System.out.println(total / notasAlunosA.length);
        }

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        System.out.println(Arrays.toString(notasAlunoB));

        double totalB = 0;
        for (double nota: notasAlunoB){
            System.out.println(nota);
            totalB += nota;
            System.out.println(totalB / notasAlunoB.length);
        }



    }
}
