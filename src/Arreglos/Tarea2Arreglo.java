package Arreglos;

//Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
// por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
public class Tarea2Arreglo {
    public static void main(String[] args) {

        int[] arreglo = {14, 33, 15, 36, 78, 21, 43};
        int max = 0;
        for (int i = 0; i < arreglo.length; i++) {
            max = (arreglo[max] > arreglo[i])? max:i;
        }
        System.out.println("El numero mayor del arreglo es: " + arreglo[max]);

    }
}
