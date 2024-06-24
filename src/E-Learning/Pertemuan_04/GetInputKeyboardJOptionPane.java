import javax.swing.JOptionPane;

public class GetInputKeyboardJOptionPane {
  public static void main(String[] args) {
    String nama = JOptionPane.showInputDialog("Ketikan Nama Anda : ");
    String msg = "Hello " + nama + "\nLanjutkan belajarnya pasti menjadi programmer Java !";
    JOptionPane.showMessageDialog(null, msg);
  }
}
