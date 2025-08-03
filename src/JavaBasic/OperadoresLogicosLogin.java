package JavaBasic;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] username = new String[3];
        String[] password =new String[3];
        //Otra forma de iniciar String[] username = { "Erick", "Joudy", "Admin"}
        String cuenta, cont;
        boolean isAutenticado =  false;

        username[0] = "Erick";
        username[1] = "Joudy";
        username[2] = "Admin";
        password[0] = "1234";
        password[1] = "1234";
        password[2] = "12345";

        System.out.println("Ingrese su username: ");
        cuenta = sc.nextLine();
        System.out.println("Ingrese su password: ");
        cont = sc.nextLine();
        for (int i = 0; i < username.length; i ++){
            isAutenticado = (username[i].equals(cuenta) && password[i].equals(cont))? true: isAutenticado;
            //if(username[i].equals(cuenta) && password[i].equals(cont)){
             //   isAutenticado = true;
             //   break;
            //}
        }

        if(isAutenticado){
            System.out.println("Bienvenido " + cuenta.concat("!"));
        }else{
            System.out.println("Username o password incorrecto. Vuelva intentarlo nuevamente");
        }


    }
}
