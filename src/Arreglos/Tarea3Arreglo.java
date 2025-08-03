package Arreglos;

import java.util.Scanner;

//Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio
// de los números positivos, el promedio de los negativos y contar el número de ceros.
public class Tarea3Arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[7];
        double promedio1, promedio2;
        int suma1 = 0,suma2 = 0, contador1 = 0, contador2 = 0, contador3 = 0;
        System.out.println("Ingrese 7 numeros enteros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i]<0){
                suma1+=numeros[i];
                contador1++;
            }else if(numeros[i]>0){
                suma2+=numeros[i];
                contador2++;
            }else{
                contador3++;
            }
        }
        promedio1 = ((double) suma1 /contador1);
        promedio2 = (double) suma2 /contador2;
        System.out.println("El promedio de los numeros negativos es: " + promedio1);
        System.out.println("El promedio de los numeros positivos es: " + promedio2);
        System.out.println("La cantidad de cero en total del arreglo es: " + contador3);
    }
}
