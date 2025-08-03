package Matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        int [][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("numero de filas: " + numeros.length);
        System.out.println("numero de columna: " + numeros[0].length);

        System.out.println("primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("El ultimo elemento: " + numeros[numeros.length -1][numeros[1].length -1]);


    }
}
