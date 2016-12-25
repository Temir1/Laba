package swingnumber;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class HelloSwing {
  /** main */
  public static void main(String []args) {
    JFrame frame = new JFrame("Form");
    frame.setSize(new Dimension(600, 400));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new FlowLayout());

    JLabel label = new JLabel("Hello World");
    label.setForeground(Color.GREEN);
    frame.add(label);
    frame.setVisible(true);
  }


}
