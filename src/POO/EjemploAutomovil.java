package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");

        subaru.asignarCilindrada(2.0);
        subaru.asignarColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0d);

        System.out.println("mazda.fabricante: " + mazda.leerFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50);

        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));

        subaru.verDetalle();
        mazda.verDetalle();
        System.out.println(subaru.acelerar(3000));
        System.out.println(nissan.verDetalle());

        System.out.println(mazda.acelerarFrenar(40000));

        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 0.75f));
        //Encapsulamiento
        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 75));
    }
}
