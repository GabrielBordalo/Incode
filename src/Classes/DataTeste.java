package Classes;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.ano = 2010;

        var d2 = new Data(5, 9, 1986);
        //d2.dia = 5;
        //d2.mes = 9;
        //d2.ano = 1986;

        System.out.printf("%d %d %d\n",d1.dia, d1.mes, d1.ano);

        System.out.println(d2.obterDataFormatada());

    }


}
