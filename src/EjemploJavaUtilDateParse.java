import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd': ");
        try {
            //Date fecha = format.parse("2020-01-05");
            Date fecha = format.parse(sc.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("Fecha1 del usuario es despues de la fecha2 = actual");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha es anterior que fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("La fecha ingresada es igual al actual 'fecha2'");
            }

            System.out.println("OTRA FORMA DE COMPARAR FECHA CON EL METODO COMPARETO");

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha1 del usuario es despues de la fecha2 = actual");
            }else if(fecha.compareTo(fecha2) < 0 ){
                System.out.println("Fecha es anterior que fecha2");
            }else if(fecha.compareTo(fecha2) == 0 ){
                System.out.println("La fecha ingresada es igual al actual 'fecha2'");
            }


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
