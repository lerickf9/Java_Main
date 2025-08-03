package JavaBasic;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        //Aplicamos desde un menu de almuerzo la sentencia de swithCase y aplicamos if y ternario para
        //Aplicar lo aprendido.
        Scanner sc = new Scanner(System.in);
        String resp;
        float suma = 0;
        int opcion = 0, multiplo = 0, propina = 0;
        System.out.println("*******MENU DEL DIA*******");
        System.out.println("1. Completo = $2.500");
        System.out.println("2. Churrasco = $5.500");
        System.out.println("3. Bebida = $1.000");
        System.out.println("4. Salir");
        System.out.println("Ingrese la opcion que desea: ");
        opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Cuantos completos desea? ");
                multiplo = sc.nextInt();
                suma += multiplo * 2500;
                break;

            case 2:
                System.out.println("Cuantos Churrascos desea? ");
                multiplo = sc.nextInt();
                suma += multiplo * 5500;
                break;

            case 3:
                System.out.println("Cuantas bebida desea? ");
                multiplo = sc.nextInt();
                suma += multiplo * 1000;
                break;
            default:
                System.out.println("Gracias por visitarnos!");
        }
        if (suma > 0) {
            System.out.println("Su pedido total es de: " + suma);
            System.out.println("Desea sumar la propina? responde 1 =\"si\" o 2 =\"no\"");
            propina = sc.nextInt();
            resp = propina == 1 ? "El total a pagar es: " + (suma * 1.2) : "El total a pagar es: " + suma;
            System.out.println(resp);
        }
    }

}

