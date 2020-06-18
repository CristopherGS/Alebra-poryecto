package clases;

import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Calculador_natrix {

    private float[][] matrix;
    private float[] result;
    private float[] B;

    public Calculador_natrix(float[][] matrixx, float[] b) {
        matrix = matrixx;
        B = b;
    }

    public float[][] getMatrix() {
        return matrix;
    }

    public float[] getResult() {
        return result;
    }

    public void eliminate(JTextArea a) {
        int startColumn = 0;
        toString(a);

        for (int row = 0; row < matrix.length; row++) {
            //si el inicio de la colimna es 0 lo cmabia con otra fila

            toString(a);

            while (matrix[row][startColumn] == 0.0) {

                boolean switched = false;
                int i = row;

                while (!switched && i < matrix.length) {

                    if (matrix[i][startColumn] != 0.0) {

                        float[] temp = matrix[i];
                        matrix[i] = matrix[row];
                        matrix[row] = temp;
                        switched = true;
                    }
                    i++;
                }
                //si el siguente sigue siendo 0 lo cambia de columna
                if (matrix[row][startColumn] == 0.0) {

                    startColumn++;
                }
            }

            //si el numero no es 1 en la primera posicion de la columna 1 lo reduce
            if (matrix[row][startColumn] != 1.0) {

                float divisor = matrix[row][startColumn];

                for (int i = startColumn; i < matrix[row].length; i++) {

                    matrix[row][i] = matrix[row][i] / divisor;
                }
            }

            
            for (int i = 0; i < matrix.length; i++) {

                if (i != row && matrix[i][startColumn] != 0) {

                    float multiple = 0 - matrix[i][startColumn];
                    for (int j = startColumn; j < matrix[row].length; j++) {
                        matrix[i][j]
                                += multiple * matrix[row][j];
                    }
                }
            }
            startColumn++;
        }
        toString(a);
    }

    public void eliminate2() {
        int startColumn = 0;
        for (int row = 0; row < matrix.length; row++) {
            //si el inicio de la colimna es 0 lo cmabia con otra fila

            System.out.println(toString2());

            while (matrix[row][startColumn] == 0.0) {

                boolean switched = false;
                int i = row;

                while (!switched && i < matrix.length) {

                    if (matrix[i][startColumn] != 0.0) {

                        float[] temp = matrix[i];
                        matrix[i] = matrix[row];
                        matrix[row] = temp;
                        switched = true;
                    }
                    i++;
                }
                //si el siguente sigue siendo 0 lo cambia de columna
                if (matrix[row][startColumn] == 0.0) {

                    startColumn++;
                }
            }

            //si el numero no es 1 en la primera posicion de la columna 1 lo reduce
            if (matrix[row][startColumn] != 1.0) {

                float divisor = matrix[row][startColumn];

                for (int i = startColumn; i < matrix[row].length; i++) {

                    matrix[row][i] = matrix[row][i] / divisor;
                }
            }

            
            for (int i = 0; i < matrix.length; i++) {

                if (i != row && matrix[i][startColumn] != 0) {

                    float multiple = 0 - matrix[i][startColumn];
                    for (int j = startColumn; j < matrix[row].length; j++) {
                        matrix[i][j]
                                += multiple * matrix[row][j];
                    }
                }
            }
            startColumn++;
        }
    }

    public void inversaporB() {
        float[] resultado = new float[3];
        for (int i = 0; i < 3; i++) {
            //                      0,0    0,0       0         0,1       1        0,2      2
            resultado[i] = ((matrix[i][3] * B[0]) + (matrix[i][4] * B[1]) + (matrix[i][5] * B[2]));
            System.out.println("RESULTADO--> " + resultado[i]);
        }
        result = resultado;
    }

    public double[] transformacionPuntosA(double[][] transformacion, double x, double y) {
        double[] resultado = new double[2];

        for (int i = 0; i < 2; i++) {
            resultado[i]=((transformacion[i][0]* x)+(transformacion[i][1]* y));
            System.out.println(resultado[i]+"---> "+i);
        }

        return resultado;
    }

    public void toString(JTextArea mos) {
        String text = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                text += matrix[i][j] + ", ";

            }
            text += "\n";
        }
        mos.append(text + "\n");
    }

    public String toString2() {
        String text = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                text += matrix[i][j] + ", ";
            }
            text += "\n";
        }
        return text;
    }

}
