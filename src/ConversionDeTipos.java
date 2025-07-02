public class ConversionDeTipos {
    public static void main(String[] args) {
        String numberStr = "50";

        int numeroInt = Integer.parseInt(numberStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98978.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("real Double " + realDouble);

        boolean logicoStr = true;
        String logicoBoolean = String.valueOf(Boolean.parseBoolean(String.valueOf(logicoStr)));
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otrNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otrNumeroInt);

        String otroNumeroStr = Integer.toString(otrNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otrNumeroInt+10);
        System.out.println("otroNumeroStr" + otroNumeroStr);

        double otroRealDouble = 1.23443e3;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 1000;
        short s = (short) i;

    }
}
