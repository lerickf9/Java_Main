import java.util.Scanner;

public class TareaAreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = 0;
        System.out.println("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        area = Math.PI*Math.pow(radio,2);

        System.out.println("El área del circulo es: " + area);

    }
}
