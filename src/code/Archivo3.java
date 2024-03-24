package code;
import java.util.UUID;
public class Archivo3 {

  public static void main(String[] args) {
    System.out.println("Hola Mundo, estamos aprendiendo a utilizar fork desde GitHub");
        generateUUID();
        otherGenerateUUID();
    }
    private static void generateUUID() {
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID generado: " + uuid);
    }
    private static void otherGenerateUUID() {
        String nombre = "Julia";
        byte[] bytes = nombre.getBytes();
        UUID uuid = UUID.nameUUIDFromBytes(bytes);
        System.out.println("UUID generado desde el nombre: " + nombre + ": " +uuid);
    }
  
}
