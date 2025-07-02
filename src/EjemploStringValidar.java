public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esnulo = curso == null;
        System.out.println("es nulo = " + esnulo);

        if(!esnulo){
            System.out.println(curso.toUpperCase());
        }
        //System.out.println(curso.concat(" desde cero!"));
        System.out.println("Bienvenido " + curso);

        if(esnulo){
            curso = "Programacion Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
