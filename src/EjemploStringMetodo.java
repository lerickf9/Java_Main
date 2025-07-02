public class EjemploStringMetodo {
    public static void main(String[] args) {
        String nombre = "Erick";

        System.out.println("nombre.lenght() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals\"Erick\" = " + nombre.equals("Erick"));
        System.out.println("nombre.equals\"Erick\" = " + nombre.equals("erick"));
        System.out.println("nombre.equalsIgnoreCase\"Erick\" = " + nombre.equalsIgnoreCase("erick"));
        System.out.println("nombre.compareTo\"Erick\" = " + nombre.compareTo("Erick"));
        System.out.println("nombre.compareTo\"Erick\" = " + nombre.compareTo("Joudy"));
        System.out.println("nombre.charAt\"Erick\" = " + nombre.charAt(0));
        System.out.println("nombre.charAt\"Erick\" = " + nombre.charAt(nombre.length() - 1));

        System.out.println("nombre.sub = " + nombre.substring(3));
        System.out.println("nombre.sub = " + nombre.substring(2,4));
        System.out.println("nombre.sub = " + nombre.substring(4,5));
        System.out.println("nombre.sub = " + nombre.substring(4));
        System.out.println("nombre.sub = " + nombre.substring(nombre.length()-2));

        String desc = "descripcion";
        System.out.println("descripcion = " + desc.replace("i","."));
        System.out.println(desc);
        System.out.println("descripcion.indexOf('i') = " + desc.indexOf('i'));
        System.out.println("descripcion.lastIndexOf('i') = " + desc.lastIndexOf('i'));
        System.out.println("descripcion.indexOf('i') = " + desc.indexOf('a'));
        System.out.println("descripcion.contains('cion') = " + desc.contains("cion"));
        System.out.println("descripcion.startsWith('') = " + desc.startsWith("cion"));
        System.out.println(" descripcion");
        System.out.println(" descripcion".trim());






    }
}
