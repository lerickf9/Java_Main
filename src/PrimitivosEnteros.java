public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 7;
        System.out.println("NumberoByte: " + numeroByte);
        System.out.println("tipo byte corresponde en byte a + " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a + " + Byte.SIZE);
        System.out.println("valor máximo de un bytte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un bytte: " + Byte.MIN_VALUE);

        System.out.println("---------------------------------------------------");

        short numeroshort = 32767;
        System.out.println("NumberoShort: " + numeroshort);
        System.out.println("tipo short corresponde en byte a + " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a + " + Short.SIZE);
        System.out.println("valor máximo de un Short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un Short: " + Short.MIN_VALUE);

        System.out.println("---------------------------------------------------");

        int numeroInt = 2147483647;
        System.out.println("numeroInt: " + numeroInt);
        System.out.println("tipo int corresponde en byte a + " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a + " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 21474836478L;
        System.out.println("numeroLong: " + numeroLong);
        System.out.println("tipo Long corresponde en byte a + " + Long.BYTES);
        System.out.println("tipo Long corresponde en bites a + " + Long.SIZE);
        System.out.println("valor máximo de un Long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un Long: " + Long.MIN_VALUE);

    }
}
