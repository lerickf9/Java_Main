package JavaBasic;

public class HolaMundo {
    public static void main(String[]args){
        String saludar = "Hola mundo";
        System.out.println("Aqui empezamos de nuevo");
        System.out.println( "Saludar en mayuscula = " + saludar.toUpperCase() );
        System.out.println( "Saludar en minuscula = " + saludar.toLowerCase() );

        int numero1 = 6;

        if(numero1>=5){
            System.out.println("El numero es mayo o igual que 5");
        }else{
            System.out.println("El numero es menor que 5");
        }

        String nombre;
        nombre = "Erick";

        System.out.println("Nombre = " + nombre);

    }
}
