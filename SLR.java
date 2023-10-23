public class SLR {

    private double beta0;
    private double beta1;
    int n;

    double promedioX = 0; double promedioY = 0;

    SLR() {

        beta0 = 0; beta1 = 0;
    }

    // calcular B0,  parámetro del modelo SLR
    public double calculateB0() {

        //aquí se codifica el modelo matemático construido en clase para B0

        beta0 = promedioY - (beta1 * promedioX);

        return beta0;
    }

    // calcular B1,  parámetro del modelo SLR
    public double calculateB1(double[] vectorSales, double[] vectorAdvertising) {

        //beta1 = 0; aquí se codifica el modelo matemático construido en clase para B1

        n = vectorSales.length;

        double sumatoriaXY = 0;
        double powX = 0;
        double [] salesAdvertising = new double [n];

        for(int i = 0; i < n; i++) {

            salesAdvertising[i] = vectorSales[i] * vectorAdvertising[i];

            sumatoriaXY = sumatoriaXY + salesAdvertising[i];

            promedioX = promedioX + vectorAdvertising[i];
            promedioY = promedioY + vectorSales[i];

            powX = powX + Math.pow(vectorAdvertising[i], 2);
        }

        promedioX = promedioX/n;
        promedioY = promedioY/n;

        beta1 = (sumatoriaXY - n * promedioX * promedioY)/(powX - n * Math.pow(promedioX, 2));

        return beta1;
    }

    // imprimir ecuación de regresión
    public void displayRegEq() {

        System.out.println("\nBeta 0 =  " + beta0 );
        System.out.println("Beta 1 =  " + beta1 );

    }

    // predicir ventas en función a un valor dado de advertising
    public void predict () {

        double prediction1;
        double prediction2;
        double prediction3;
        double prediction4;
        double prediction5;

        prediction1 = beta0 + (beta1 * 23);
        prediction2 = beta0 + (beta1 * 43);
        prediction3 = beta0 + (beta1 * 70);
        prediction4 = beta0 + (beta1 * 66);
        prediction5 = beta0 + (beta1 * 90);

        System.out.println("\n" +prediction1);
        System.out.println(prediction2);
        System.out.println(prediction3);
        System.out.println(prediction4);
        System.out.println(prediction5);
    }
}