package code;
import javax.swing.JOptionPane;
public class Archivo1 {
  public static int obtenerPotencia(int answer) {

        System.out.println("Aquí hallaremos la potencia de el primer número que me brindes elevado al segundo número que me brindes");

        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        System.out.println("El primer número ingreado es: " + a);
        System.out.println();
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        System.out.println("El segundo número ingreado es: " + b);
        System.out.println();

        int potencia = (int)Math.pow(a, b);

        answer = potencia;
        System.out.println(" " + b);
        System.out.print(a + " = ");
        System.out.println(answer);
        System.out.println();
        System.out.println("Gracias por usar este método.");

        return answer;

    }

  public static void numeroAleatorio() {
        System.out.println("Aquí vamos a generar números aleatorios. Para ello necesito que me brindes la cantidad de número que quieres que genere");

        int longitud=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

        int num_aleatorio[]=new int[longitud];

        //EXCEPTION: ArrayIndexOutOfBoundsException
        for( int i = 0; i<num_aleatorio.length; i++) {

            num_aleatorio[i]=(int)(Math.random()*100);

        }

        for(int cantidad: num_aleatorio) {

            System.out.println( cantidad);


        }
    }
  
}
