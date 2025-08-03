package JavaBasic;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 6.0f;

        if(promedio >= 6.5){
            System.out.println("Felicidades Aprobaste!");
        }else if(promedio >= 6.0f){
            System.out.println("Buena nota. Sigue mejorando");
        }else if(promedio >= 5.0f){
            System.out.println("No te mal. Pero sigue estudiando ");
        }else if(promedio >= 4.0f){
            System.out.println("Te salvaste.");
        }else{
            System.out.println("Reprobado!");
        }

        System.out.println("Tu promedio es..." + promedio);
    }
}
