package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        auto.fabricante = "Subaru";
        auto.modelo = "Impreza";
        auto.cilindrada = 2.0;
        auto.color = "Blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";


        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);

        System.out.println("auto.fabricante = " + mazda.fabricante);
        System.out.println("auto.modelo = " + mazda.modelo);
        System.out.println("auto.color = " + mazda.color);
        System.out.println("auto.cilindrada = " + mazda.cilindrada);
        
    }
}
