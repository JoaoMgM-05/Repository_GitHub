package code;

public class Archivo3 {
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
