package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.asignarFrabricante("Subaru");
        subaru.asignarModelo("Impreza");
        subaru.asignarCilindrada(2.0);
        subaru.asignarColor("Blanco");

        Automovil mazda = new Automovil();
        mazda.asignarFrabricante("Mazda");
        mazda.asignarModelo("BT-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("Rojo");
        System.out.println("mazda.fabricante: " + mazda.leerFabricante());


        subaru.verDetalle();
        mazda.verDetalle();
        System.out.println(subaru.acelerar(3000));

        System.out.println(mazda.acelerarFrenar(40000));

        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 0.75f));
        //Encapsulamiento
        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 75));
    }
}
