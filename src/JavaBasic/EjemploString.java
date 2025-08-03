package JavaBasic;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.igual(curso2) = " + esIgual);

        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);


        String profesor = "Erick Fuentes";
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

    }
}
