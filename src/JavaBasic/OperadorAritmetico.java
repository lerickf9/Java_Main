package JavaBasic;

import java.util.Scanner;

public class OperadorAritmetico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Ingrese el primer numero: ");
        number1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        number2 = sc.nextInt();
        System.out.println("---------Menu------------");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("Ingrese una opcion");
        number3 = sc.nextInt();

        if (number3 == 1) {
            System.out.println("La suma es: " + (number1 + number2));
        } else if (number3 == 2) {
            System.out.println("La resta es: " + (number1 - number2));
        } else if (number3 == 3) {
            System.out.println("La multiplicacion es: " + (number1 * number2));
        } else if (number3 == 4) {
            System.out.println("La division es: " + ((float) number1 / (float) number2));
        } else {
            System.out.println("Vuelva a intentarlo nuevamente");
        }

    }
}
