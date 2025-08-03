package JavaBasic;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 4, 6, 8, 9, 10};
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
        //el foreach solo puede iterar arreglos
        for(int num: numeros){
            System.out.println("num: " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Pato", "Pepa" };


        for(String nommbre: nombres){
            System.out.println("nombre: " + nommbre);
        }


    }
}
