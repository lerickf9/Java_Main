package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        subaru.verDetalle();
        mazda.verDetalle();
        System.out.println(subaru.acelerar(3000));

        System.out.println(mazda.acelerarFrenar(40000));

        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 0.75f));
        //Encapsulamiento
        System.out.println("Kilometros por litros " + subaru.calcularConsumo(300, 75));
    }
}
