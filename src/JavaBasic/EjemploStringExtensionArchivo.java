package JavaBasic;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpeg";
        System.out.println(archivo.length());
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.legnth()-4) = " + archivo.substring(i + 1));


    }
}
