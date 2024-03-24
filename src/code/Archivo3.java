package code;
import java.util.UUID;
public class Archivo3 {

  public static void main(String[] args) {
    otherGenerateUUID();
  }
  private static void otherGenerateUUID() {
        String nombre = "Julia";
        byte[] bytes = nombre.getBytes();
        UUID uuid = UUID.nameUUIDFromBytes(bytes);
        System.out.println("UUID generado desde el nombre: " + nombre + ": " +uuid);
    }
}
