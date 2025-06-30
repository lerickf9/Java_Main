public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean dataLogico = false;
        boolean esIgual = false;

        System.out.println("Data Logico 1: " + dataLogico);

        double d = 122.244d;
        float f = 98.34444f;
        dataLogico = (d > f);
        System.out.println("Data Logico 2: " + dataLogico);

        if(!dataLogico){
            esIgual = (3 == 1 );
            System.out.println("Data logico 3: " + esIgual);
        }else{
            System.out.println("Data logico 4: " + esIgual);
        }
    }
}
