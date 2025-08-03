package JavaBasic;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable = condicion ? si es verdadero: si es falso;

        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado;
        double promedio;

        double matematicas = 0, ciencias = 0, historia = 0;
        try {
            System.out.println("Ingrese la nota de matematicas: ");
            matematicas = sc.nextDouble();
            System.out.println("Ingrese la nota de ciencias: ");
            ciencias = sc.nextDouble();
            System.out.println("Ingrese la nota de historia: ");
            historia = sc.nextDouble();
        }catch (NumberFormatException ex){
            System.out.println("Formato incorrecto. Ingrese nuevamente");
        }
        promedio = (matematicas + ciencias + historia)/3;

        estado = promedio >= 3.95 ? "Aprobado, Felicicdades!" : "Recahzado, Sigue Estudiando";
        System.out.println("Estimado. Usted termino con promedio " + promedio + " estado: " + estado);

        //if(promedio >= 5.49){
        //    estado = "Aprobado";
        //}else{
        //    estado = "Rechazado";
        //}
    }
}
