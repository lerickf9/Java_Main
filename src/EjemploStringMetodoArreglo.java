import java.util.Arrays;

public class EjemploStringMetodoArreglo {
    public static void main(String[] args) {
        String descripcion = "descripcion";

        System.out.println("descripcion.toCharArray() = " + descripcion.toCharArray());
        char[] arreglo= descripcion.toCharArray();
        for(int i = 0; i < descripcion.length(); i++){
            System.out.println(arreglo[i]);
        }

        System.out.println("descripcion = " + descripcion.split("i"));

        String[] arreglo2 = descripcion.split("i");
        int l = arreglo2.length;
        for(int i=0; i<l; i++){
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("[.]");// otra opcion es con: "\\."
        l=archivoArr.length;
        System.out.println("l.length = " + l);
        for(int i = 0; i < l; i++){
            System.out.println(archivoArr[i]);
        }

        System.out.println("extension = " + archivoArr[l-1]);
    }
}
