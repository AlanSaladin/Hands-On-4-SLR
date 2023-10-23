import java.util.Scanner;

public class Main {

    public static void main(String[] noseusa) {

        Scanner lector = new Scanner(System.in);

        double [] sales = {3,6,9,12,15,18,21,24,27};
        double [] advertising = {1,2,3,4,5,6,7,8,9};

        // instanciar un objeto tipo Simple Linear Regression (SLR)
        SLR slr = new SLR();
        double x ;

        // calcular parámetros del model b0 y b1
        double beta1 = slr.calculateB1(sales, advertising);
        double beta0 = slr.calculateB0();

        // desplegar ecuación de regresión
        slr.displayRegEq();

        slr.predict();
    }
}