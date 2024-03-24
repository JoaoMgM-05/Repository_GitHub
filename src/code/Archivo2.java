package code;
import javax.swing.JOptionPane;
public class Archivo2 {

  private static int leerOpcion() {
        int opcion;

        System.out.println("----------------------------");
        System.out.println("------MENU DE OPCIONES------");
        System.out.println("----------------------------");
        System.out.println("1)-----OBTENER POTENCIA-----");
        System.out.println("2)-GENERAR NUMERO ALEATORIO-");
        System.out.println("3)----CALCULAR FACTORIAL----");
        System.out.println("4)----------SALIR-----------");
        System.out.println("----------------------------");

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU", "ELIGE UNA OPCIÓN"));

        return opcion;

    }
  
}
