package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];

        System.out.println("Ingrese 7 numeros enteros");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        boolean asc = false;
        boolean des = false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > a[i+1]){
                des = true;
            }
            if(a[i] < a[i+1]){
                asc = true;
            }
        }

        if(asc && des){
            System.out.println("Arreglo = desordenado");
        }
        if(!asc && !des){
            System.out.println("Arreglo = todos son iguales");
        }
        if(asc && !des){
            System.out.println("Arreglo = ordenado de forma ascendente");
        }
        if(!asc && des){
            System.out.println("Arreglo = ordenado de forma descendente");
        }

    }
}
