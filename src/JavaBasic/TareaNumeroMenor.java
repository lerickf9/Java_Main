package JavaBasic;

import java.util.Scanner;

public class TareaNumeroMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num =new int[10];
        int acumulado = 1;
        for (int i =0; i<10; i++){
            System.out.println("Ingrese numero aleatorio "+acumulado+":");
            num[i] = sc.nextInt();
            acumulado++;
        }
        int menor = num[0];
        for(int i = 0; i< num.length; i++){
            menor = (num[i] < menor) ? num[i] : menor;
        }

        System.out.println("El menor numero es el: "+ menor);

    }
}
