package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosInversoMutable {

    public static void main(String[] args) {


        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Discu Duro SSD Samsunf Externo", "Asus Notebook" , "Macbook Air",
                "Chromecast 4ta generacion", "Bicicleta"};
        int total = productos.length;

        Arrays.sort(productos);

        System.out.println("******usando for**********");
        for(int i = 0; i< total; i ++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        /*
        for (int i = 0; i < total/2; i++) {

            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }
         */

        System.out.println("******Collections.reverse()**********");
        Collections.reverse(Arrays.asList(productos));
        for(int i = 0; i< total; i ++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}
