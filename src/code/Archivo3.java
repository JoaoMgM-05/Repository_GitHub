package code;
import java.util.UUID;
public class Archivo3 {

  public static void main(String[] args) {
    generateUUID();
  }
  private static void generateUUID() {
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID generado: " + uuid);
    }
}
