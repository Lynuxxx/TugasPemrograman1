package Modul_16_GUI;

import javax.swing.*;

//? JPanel
import java.awt.*;

public class TampilFrame extends JFrame{ 
  private JPanel panelku = new JPanel(); 
  //? JLabel
  private static JLabel labelku = new JLabel("Nama : ");
  private static JLabel labelku2 = new JLabel("NIM : ");
  //? JTextField
  private static JTextField Txtku = new JTextField(); 
  private static JTextField Txtku2 = new JTextField(); 
  //? JButon
  private static JButton Tombol = new JButton("Kirim");

  public TampilFrame(){ 
  super("Membuat Frame dengan JFrame");

  //? JPanel
  panelku.setLayout(null); 
  panelku.setSize(150,200);
  panelku.setBackground(Color.blue);

  //? JLabel
  labelku.setBounds(50,30,160,25); 
  labelku.setForeground(Color.white);
  labelku2.setBounds(50,80,160,25); 
  labelku2.setForeground(Color.white);
  panelku.add(labelku); 
  panelku.add(labelku2); 
  
  //? JTextField
  Txtku.setBounds(100,30,160,25); 
  panelku.add(Txtku); 
  Txtku2.setBounds(100,80,160,25); 
  panelku.add(Txtku2);  
  //? JButton

  Tombol.setBounds(130,120,80,25); 
  panelku.add(Tombol); 

  setSize(350,200); 
  setDefaultCloseOperation(EXIT_ON_CLOSE); 

  //? JPanel
  getContentPane().add(panelku);

  setVisible(true); 
  } 
  
  public static void main(String args[]){ 
  TampilFrame frameku = new TampilFrame(); 
  } 
}