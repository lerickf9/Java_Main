public class SentenciasBubleEtiquetaBuscar {
    public static void main(String[] args) {

        String frase = "tres tristres tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int max = frase.length();
        int maxPalabra = palabra.length();
        int cantidad = 0;
        buscar:
        for(int i = 0; i < max; i++){
            int k=i;
            for(int j = 0; j< maxPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }

            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+palabra+"' en la frase.");
    }
}
