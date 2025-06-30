public class SistemaNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("Numero decimal " + numeroDecimal);

        System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("Numero binario a decimal es: " + numeroBinario);

        System.out.println("Numero Octal de: " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 036;
        System.out.println("numero Octal = " + numeroOctal);

        System.out.println("numero Hexadecimal  de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);
    }
}
