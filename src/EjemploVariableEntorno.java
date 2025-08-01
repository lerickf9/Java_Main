import java.util.Map;

public class EjemploVariableEntorno {
    public static void main(String[] args) {


        Map<String, String> varEnv = System.getenv();
        System.out.println("variables de ambiente del sistema = " + varEnv);
        
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);
        
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);
        
    }

}
