package Arreglos;

import java.util.Arrays;

public class EjemploArreglosInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Discu Duro SSD Samsunf Externo", "Asus Notebook" , "Macbook Air",
                "Chromecast 4ta generacion", "Bicicleta"};
        int total = productos.length;


        /*
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Discu Duro SSD Samsunf Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta";
        */
        Arrays.sort(productos);

        System.out.println("******usando for**********");
        for(int i = 0; i< total; i ++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
        System.out.println("******usando for inverso**********");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + i + " valor: " + productos[total-1-i]);
        }
        System.out.println("******usando for inverso 2**********");
        for (int i = total - 1; i >= 0 ;i--) {
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }
    }
}
