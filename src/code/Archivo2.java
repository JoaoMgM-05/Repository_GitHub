package code;
import javax.swing.JOptionPane;
public class Archivo2 {

  public static void main(String[] args) {

        int opcion;

        do {

            opcion = leerOpcion();

            ejecutarOpcion(opcion);

        } while (opcion != 4); //IOException

        System.out.println("Gracias por usar el programa");
    }
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
  private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                Archivo2.obtenerPotencia(opcion);
                break;
            case 2:
                Archivo2.numeroAleatorio();
                break;
            case 3:
                Archivo2.calcFactorial();
                break;
            case 4:
                System.out.println("PROGRAMA FINALIZADO");
                break;
        }
    }
  
}
