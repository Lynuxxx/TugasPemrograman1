import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class CombinedInputApp {
    public static void main(String[] args) {

      // Menggunakan JOptionPane
      String namaJOptionPane = JOptionPane.showInputDialog("Ketikan Nama Anda : ");
      String msg = "Hello " + namaJOptionPane + "\nLanjutkan belajarnya pasti menjadi programmer Java !";
      JOptionPane.showMessageDialog(null, msg);
      
      // Menggunakan BufferedReader
      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      String nama = "";
      System.out.print("\nKetikan Nama Anda : ");
      
      try {
        nama = dataIn.readLine();
      } catch (IOException e) {
        System.out.print("Error");
      }
      System.out.println();
      System.out.println("Hello " + nama + "\nLanjutkan belajarnya pasti menjadi programmer Java !");

    }
}
