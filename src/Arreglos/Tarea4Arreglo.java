package Arreglos;

/*
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa
que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que
aparece en el arreglo.
Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
Como resultado debería imprimir lo siguiente:
La mayor ocurrencias es: 3
El elemento que mas se repite es: 5
En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
 */
import java.util.Scanner;

public class Tarea4Arreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero de 1 a 9: ");
            arreglo[i] = scanner.nextInt();
        }

        int[] arregloCantidadValores = new int[10];

        for (int i = 0; i < arreglo.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    cantidad++;
                }
            }
            arregloCantidadValores[i] = cantidad;
        }

        int indice = 0; // indice del elemento con la mayor ocurrencia (mas repetido)
        int max = 0; // la cantidad mayor de veces (la mayor ocurrencia)
        for (int i = 0; i < 10; i++) {
            if (max < arregloCantidadValores[i]) {
                max = arregloCantidadValores[i];
                indice = i;
            }
        }
        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas se repite es: " + arreglo[indice]);
        System.out.println("el elemento " + arreglo[indice] + " esta repetido " + max + "veces!");
    }
}
