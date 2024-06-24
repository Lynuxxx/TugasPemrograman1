import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Kalkulatorku extends JFrame {
    private static JTextField tampilanTextField = new JTextField();
    private static String operant1 = "";
    private static String operant2 = "";
    private static String operatorDipilih = "";
    private static boolean setelahOperator = false;
    private JButton tombol1 = new JButton("1");
    private JButton tombol2 = new JButton("2");
    private JButton tombol3 = new JButton("3");
    private JButton tombol4 = new JButton("4");
    private JButton tombol5 = new JButton("5");
    private JButton tombol6 = new JButton("6");
    private JButton tombol7 = new JButton("7");
    private JButton tombol8 = new JButton("8");
    private JButton tombol9 = new JButton("9");
    private JButton tombol0 = new JButton("0");
    private JButton tombolTambah = new JButton("+");
    private JButton tombolKurang = new JButton("-");
    private JButton tombolKali = new JButton("*");
    private JButton tombolSamaDengan = new JButton("=");
    private JPanel panelku = new JPanel();
    Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    private int Jml = 1;

    Kalkulatorku() {
        super("Aplikasi Kalkulatorku");
        panelku.setLayout(null);
        setSize(350, 350);
        setLocation(dimensi.width / 2 - getWidth() / 2, dimensi.height / 2 -
                getHeight() / 2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /* Menambah TextField pada koordinat (X,Y,Lebar,Tinggi) */
        tampilanTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tampilanTextField.setEditable(false);
        tampilanTextField.setBounds(55, 20, 200, 25);
        /* Menambah Button pada koordinat (X,Y,Lebar,Tinggi) */
        tombol1.setBounds(50, 90, 50, 25);
        tombol2.setBounds(110, 90, 50, 25);
        tombol3.setBounds(50, 120, 50, 25);
        tombol4.setBounds(110, 120, 50, 25);
        tombol5.setBounds(50, 150, 50, 25);
        tombol6.setBounds(110, 150, 50, 25);
        tombol7.setBounds(50, 180, 50, 25);
        tombol8.setBounds(110, 180, 50, 25);
        tombol9.setBounds(50, 210, 50, 25);
        tombol0.setBounds(110, 210, 50, 25);
        tombolTambah.setBounds(180, 90, 50, 25);
        tombolKurang.setBounds(180, 120, 50, 25);
        tombolKali.setBounds(240, 120, 50, 25);
        tombolSamaDengan.setBounds(240, 90, 50, 25);
        /* Menambahkan Action Listener pada button */
        tombol1.addActionListener(new TombolHandler());
        tombol2.addActionListener(new TombolHandler());
        tombol3.addActionListener(new TombolHandler());
        tombol4.addActionListener(new TombolHandler());
        tombol5.addActionListener(new TombolHandler());
        tombol6.addActionListener(new TombolHandler());
        tombol7.addActionListener(new TombolHandler());
        tombol8.addActionListener(new TombolHandler());
        tombol9.addActionListener(new TombolHandler());
        tombol0.addActionListener(new TombolHandler());
        tombolTambah.addActionListener(new TombolHandler());
        tombolKurang.addActionListener(new TombolHandler());
        tombolKali.addActionListener(new TombolHandler());
        tombolSamaDengan.addActionListener(new TombolHandler());
        /* Menambahakan TextField pada panel */
        panelku.add(tampilanTextField);
        /* Menambahakan button pada panel */
        panelku.add(tombol1);
        panelku.add(tombol2);
        panelku.add(tombol3);
        panelku.add(tombol4);
        panelku.add(tombol5);
        panelku.add(tombol6);
        panelku.add(tombol7);
        panelku.add(tombol8);
        panelku.add(tombol9);
        panelku.add(tombol0);
        panelku.add(tombolTambah);
        panelku.add(tombolKurang);
        panelku.add(tombolKali);
        panelku.add(tombolSamaDengan);
        /* Menambahakan panel pada frame */
        getContentPane().add(panelku);
        setVisible(true);
    }

    private class TombolHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton tombol = (JButton) e.getSource();
            if (tombol.getText().equals("1")) {
                if (setelahOperator) {
                    tampilanTextField.setText("1");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "1");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("2")) {
                if (setelahOperator) {
                    tampilanTextField.setText("2");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "2");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("3")) {
                if (setelahOperator) {
                    tampilanTextField.setText("3");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "3");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("4")) {
                if (setelahOperator) {
                    tampilanTextField.setText("4");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "4");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("5")) {
                if (setelahOperator) {
                    tampilanTextField.setText("5");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "5");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("6")) {
                if (setelahOperator) {
                    tampilanTextField.setText("6");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "6");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("7")) {
                if (setelahOperator) {
                    tampilanTextField.setText("7");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "7");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("8")) {
                if (setelahOperator) {
                    tampilanTextField.setText("8");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "8");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("9")) {
                if (setelahOperator) {
                    tampilanTextField.setText("9");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "9");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("0")) {
                if (setelahOperator) {
                    tampilanTextField.setText("0");
                } else {
                    tampilanTextField.setText(tampilanTextField.getText() + "0");
                }
                setelahOperator = false;
            } else if (tombol.getText().equals("+")) {
                operant1 = tampilanTextField.getText();
                operatorDipilih = "+";
                setelahOperator = true;
            } else if (tombol.getText().equals("-")) {
                operant1 = tampilanTextField.getText();
                operatorDipilih = "-";
                setelahOperator = true;
            } else if (tombol.getText().equals("*")) {
                operant1 = tampilanTextField.getText();
                operatorDipilih = "*";
                setelahOperator = true;
            } else if (tombol.getText().equals("=")) {
                operant2 = tampilanTextField.getText();
                double operantPertama = 0;
                double operantKedua = 0;
                try {
                    operantPertama = Double.parseDouble(operant1);
                } catch (Exception ex) {
                }
                try {
                    operantKedua = Double.parseDouble(operant2);
                } catch (Exception ex) {
                }
                if (operatorDipilih == "+") {
                    tampilanTextField.setText(Double.toString(operantPertama + operantKedua));
                }
                if (operatorDipilih == "-") {
                    tampilanTextField.setText(Double.toString(operantPertama - operantKedua));
                }
                if (operatorDipilih == "*") {
                    tampilanTextField.setText(Double.toString(operantPertama * operantKedua));
                }
            }
        }
    }

    public static void main(String args[]) {
        Kalkulatorku kalkulator = new Kalkulatorku();
    }
}