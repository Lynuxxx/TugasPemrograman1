import javax.swing.*;

public class TampilComboBox extends JFrame {
  final static String Pilihan[] = { "Pilihan ke-1", "Pilihan ke-2",
      "Pilihan ke-3" };
  private JPanel panelku = new JPanel();
  private static JComboBox ComboBox = new JComboBox(Pilihan);

  TampilComboBox() {
    super("Bagus Maulana Hasan - 221011400240");
    panelku.setLayout(null);
    setSize(350, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    ComboBox.setBounds(90, 70, 150, 25);
    panelku.add(ComboBox);
    getContentPane().add(panelku);
    setVisible(true);
  }

  public static void main(String args[]) {
    TampilComboBox frameku = new TampilComboBox();
    ComboBox.addItem("Pilihan Tambahan");
    ComboBox.removeItem("Pilihan ke-2");
  }
}