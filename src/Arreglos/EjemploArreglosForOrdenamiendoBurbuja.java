package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamiendoBurbuja {

    public static void main(String[] args) {


        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Discu Duro SSD Samsunf Externo", "Asus Notebook" , "Macbook Air",
                "Chromecast 4ta generacion", "Bicicleta"};
        int total = productos.length;

        int contador = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if(productos[i].compareTo(productos[j])< 0 ){
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador: " + contador);

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
    }
}
