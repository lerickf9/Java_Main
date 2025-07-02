import java.util.Scanner;

public class TareaFactura {
    public static void main(String[] args) {
        double producto1 =0;
        double producto2 =0;
        double total = 0;
        double iva = 0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingrese el valor del primer producto: ");
            producto1 = sc.nextDouble();
            System.out.println("Ingrese el valor del segundo producto: ");
            producto2 = sc.nextDouble();
            System.out.println("----------------------------------------");
            total = producto1 + producto2;
            iva = total * 0.19;
            System.out.println("El valor total de sus producto neto es: " + total + ". El valor " +
                    "del IVA es de: " + iva + ". El valor total es de la cuenta es de: " + (total + iva));
        }catch(NumberFormatException e){
            System.out.println("Ingreso otro tipo de dato no numerico. Vuelva a intentarlo!");
        }

    }
}
