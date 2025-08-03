package JavaBasic;

import javax.swing.*;
import java.util.*;

public class TareaMenu {
    public static void main(String[] args) {
        /*
        Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear, listar y salir.
        Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase
        Scanner indicando una lista con las opciones, cada opción asociada a un numero.
         O bien! otra forma mucho mejor seria usando la clase JOptionPane para un menú con interfaces graficas de la siguiente forma:
        */
        Scanner sc = new Scanner(System.in);
        int opcionIndice = 0;
        ArrayList<String> nomProducto = new ArrayList<>();
        /*
         los Map (o mapas) los veremos mas adelante en el curso en profundidad
         pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
         también se les conoce como diccionarios para almacenar datos en base a un nombre.
         */
        do {
            Map<String, Integer> opciones = new HashMap();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
                String mensaje = null;
                // aca un if o switch para las distintas opciones.

                switch (opcionIndice) {
                    case 1:
                        StringBuilder cadena = new StringBuilder();
                        int contador=1;
                        for (String elemento : nomProducto) {
                            cadena.append(contador).append(".- ").append(elemento).append("\n");
                            contador++;
                        }
                        JOptionPane.showInternalMessageDialog(null, cadena.toString(), "Contenido de productos...", JOptionPane.INFORMATION_MESSAGE);
                        try{
                            int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del producto que quiere actualizar: "));
                            index = (index-1);
                            nomProducto.remove(index);
                            String nom = JOptionPane.showInputDialog("Ingrese el nombre del producto actualizado: ").toLowerCase();
                            nomProducto.add(index, nom);
                            mensaje = "Usuario actualizado correctamente";
                            JOptionPane.showMessageDialog(null, mensaje);
                            System.out.println(mensaje);
                        }catch (NumberFormatException exception){
                            JOptionPane.showMessageDialog(null,"Ingrese un formato de numero correcto!.");
                        }
                        break;
                    case 2:
                        cadena = new StringBuilder();
                        contador=1;
                        for (String elemento : nomProducto) {
                            cadena.append(contador).append(".- ").append(elemento).append("\n");
                            contador++;
                        }
                        JOptionPane.showInternalMessageDialog(null, cadena.toString(), "Contenido de productos...", JOptionPane.INFORMATION_MESSAGE);
                        try{
                            int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del producto: "));
                            index = (index-1);
                            nomProducto.remove(index);
                            mensaje = "Usuario eliminado correctamente";
                            JOptionPane.showMessageDialog(null, mensaje);
                            System.out.println(mensaje);
                        }catch (NumberFormatException exception){
                            JOptionPane.showMessageDialog(null,"Ingrese un formato de numero correcto!.");
                        }
                        break;
                    case 3:
                        String nom = JOptionPane.showInputDialog("Ingrese el nombre del producto: ").toLowerCase();
                        if (!nom.trim().isEmpty() && !nomProducto.contains(nom.toLowerCase())) {
                            System.out.println("Nombre ingresado: " + nom);
                            mensaje = "Usuario agregado correctamente";
                            JOptionPane.showMessageDialog(null, mensaje);
                            System.out.println(mensaje);
                            nomProducto.add(nom);
                        } else {
                            mensaje = "No se ingresó ningún nombre. Intente nuevamente...";
                            JOptionPane.showMessageDialog(null, mensaje);
                        }
                        break;
                    case 4:
                        cadena = new StringBuilder();
                        contador=1;
                        for (String elemento : nomProducto) {
                            cadena.append(contador).append(".- ").append(elemento).append("\n");
                            contador++;
                        }
                        mensaje = "Listando a los usuarios...";
                        JOptionPane.showMessageDialog(null, mensaje);
                        JOptionPane.showInternalMessageDialog(null, cadena.toString(), "Contenido de productos...", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }

            }

        }while(opcionIndice != 5);

        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
        /*
        Según el numero ingresado usar un if o switch para implementar cada una de las 4 operaciones y 5 para salir.
        Dentro de cada sentencia o switch imprimir un texto relacionado a la opción, por ejemplo para actualizar:
        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
        o mediante sout en consola:
        System.out.println("Usuario actualizado correctamente");
        Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente dependiendo de la opción.
        Usar un do while para iterar hasta que la opción sea salir, cada vez que se selecciona una operación distinta a salir,
        al finalizar con dicha operación debe volver al menú para continuar con otra, al finalizar con la opción salir (5)
        se debe mostrar el mensaje "Haz salido con exito!" y finalizar el programa.
        */
    }
}
