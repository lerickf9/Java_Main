package JavaBasic;

public class PrimititvosFloat {
    public static void main(String[] args) {

        float realFloat = 1002f;
        float realFloat2 = 2.12e4f;
        float realFloat3 = 2.12e-4f;
        System.out.println("real Float: " + realFloat);
        System.out.println("real Float numero 2: " + realFloat2);
        System.out.println("real Float numero 3: " + realFloat3);

        System.out.println("float corresponde en bytte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);

        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

    }
}
