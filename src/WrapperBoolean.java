public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primerBoolean = num1  > num2;// flase
        Boolean objBoolean = Boolean.valueOf(primerBoolean);
        Boolean objBoolean2= Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primerBoolean = " + primerBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("primerBoolean2 = " + objBoolean2);

        System.out.println("comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("comparando dos objetos boolean: " + (objBoolean == objBoolean3));

        boolean primerBoolean2 = objBoolean2.booleanValue();
        System.out.println("primerBoolean2 = " +  primerBoolean2);
    }
}
