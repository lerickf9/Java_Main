import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TareaCalcularEdad {
    public static void main(String[] args) {
        /*
        Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo
        java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
        Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante,
        también se pueden apoyar de google que hay varios ejemplos.
        */
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        Date fechaActual = new Date();
        String fechaaa = formato.format(fechaActual);
        int calculo = Integer.parseInt(fechaaa);

        try {
            System.out.println("Ingrese su fecha de nacimiento con formato yyyy-MM-dd.");
            Date fecha = formato.parse(sc.next());
            String fechaaa1 = formato.format(fecha);
            int calculo1 = Integer.parseInt(fechaaa1);
            System.out.println("Usted acutalmente tiene : " + (calculo-calculo1) + " años de edad");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
