import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetInputKeyboardBufferedReader {

    public static void main(String[] args) {
      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      String nama = "";
      System.out.print("\nKetikan Nama Anda : ");

      try {
        nama = dataIn.readLine();
      } catch (Exception e) {
        System.out.print("Error");
      }

      System.out.println();
      System.out.println("Hello " + nama + "\nLanjutkan belajarnya pasti menjadi programmer Java !");
    }
    
}
