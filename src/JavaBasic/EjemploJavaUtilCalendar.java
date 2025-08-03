package JavaBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2020,Calendar.SEPTEMBER,0,20,10);//El mes 0 corresponde a Enero. Se puede dejar como constante para no equivocarse
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH,25);

        //calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.HOUR,7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND,10);


        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);

    }
}
