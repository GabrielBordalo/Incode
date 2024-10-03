package Controle;

public class ControleContinue02 {

    public static void main(String[] args) {

        //Evitar ser usado.
        externo: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    continue externo;
                }
                System.out.printf("%d %d\n",i ,j);

            }

        }


    }
}