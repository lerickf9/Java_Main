public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la calse String...";

        Integer num = 7;

        boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String = " + b1);

        b1 = num instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        //b1 = num instanceof Short; short hereda la clase de tipo Number
        //System.out.println("texto es del tipo Integer = " + b1);

        Double decimal = 45.45;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);


    }
}
