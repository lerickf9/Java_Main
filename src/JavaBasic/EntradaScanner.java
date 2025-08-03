package JavaBasic;

import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
            System.out.println("Usted a ingresado el numero: " + numeroDecimal);
        }catch (NumberFormatException e){
            System.out.println("Formato de numero incorrecto!");
        }

    }
}
