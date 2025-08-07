package POO;

import java.sql.SQLOutput;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");

        subaru.asignarCilindrada(2.0);
        subaru.asignarColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        System.out.println("Velocidad maxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad" + Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0d);

        System.out.println("mazda.fabricante: " + mazda.leerFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil.setColorPatente(Color.AZUL);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));

        System.out.println(nissan.toString());

        subaru.verDetalle();
        mazda.verDetalle();
        System.out.println(subaru.acelerar(3000));
        System.out.println(nissan.verDetalle());
        System.out.println("Automovil.getColorPatente: " + Automovil.getColorPatente().getColor());

        nissan.verDetalle();
        nissan2.verDetalle();

    }
}
