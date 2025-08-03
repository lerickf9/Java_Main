package Arreglos;

import java.util.Scanner;

/*
Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
el segundo, el antepenúltimo, el tercero, y así sucesivamente.
 */
public class Tarea1Arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] a = new int [10];
        System.out.println("Ingrese 10 números enteros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++) {
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length- 1 - i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + " valor: "+ a[i]);
        }
    }
}
