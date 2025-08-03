package JavaBasic;

import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        
        String username= System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workpace = System.getProperty("user.dir");
        System.out.println("workpace = " + workpace);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
