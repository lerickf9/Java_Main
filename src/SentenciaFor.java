public class SentenciaFor {
    public static void main(String[] args) {


        for(int i= 1; i <= 10; i++){
            System.out.println(i);
        }

        for(int i = 1; i< 10; i++){
            if(!(i%2==0)){
                continue;
            }
            System.out.println("i = " + i);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Pato", "Pepa" };
        int count = nombres.length;
        for(int i=0; i<= count; i++){
            if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                nombres[i].toLowerCase().contains("pePa".toLowerCase())){
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }


    }


}
