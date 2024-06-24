import java.io.Console;

public class LulusAtauTidak {
  public static void main(String[] args) {
    Console console = System.console();
    String confirm;

    do{
      System.out.print("\nMasukkan Nilai Anda : ");
      try {
        int nilai = Integer.parseInt(System.console().readLine());
        System.out.println( "\nHasilnya : Anda " + (nilai >= 50 ? "Lulus" : "Tidak Lulus"));
      } catch (NumberFormatException e) {
        System.out.println("Error: Masukkan angka yang valid.");
      }

      System.out.print("\nApakah Anda ingin mengulang Program (Y/N): ");
      confirm = console.readLine();
    } while(confirm.equalsIgnoreCase("Y"));
  }
}


