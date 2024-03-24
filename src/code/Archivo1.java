package code;

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
  
}
