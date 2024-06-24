public class CetakAngka {
  public static void main(String[] args) {
      System.out.print("\nMasukkan Jumlah Angka: ");
      try {
        int angka = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= angka; i++) {
          System.out.print(i + " - ");
        }
      } catch (NumberFormatException e) {
        System.out.println("Error: Masukkan angka yang valid.");
      }
  }
}

