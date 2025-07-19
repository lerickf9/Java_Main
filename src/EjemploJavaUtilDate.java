import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MM, yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
        SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
        String fechaStr1 = df1.format(fecha);
        System.out.println("fechaStr = " + fechaStr1);

        long j=0;
        for (int i = 0; i < 10000000; i++) {
            j+=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);
    }
}
