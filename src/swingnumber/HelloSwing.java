package swingnumber;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HelloSwing {
  /** main */
  public static void main(String []args) {
    JFrame frame = new JFrame("Form");
    frame.setSize(new Dimension(400, 400));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new BorderLayout());
    frame.setResizable(false);

    JLabel label = new JLabel("Hello World");
    label.setForeground(Color.BLACK);

    JPanel panelH = new JPanel();
    JPanel panelButton = new JPanel();
    JPanel panelScroll = new JPanel();
    JTextField textField = new JTextField(17);
    JButton buttonAdd = new JButton();
    JButton buttonRemove = new JButton();
    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
    Font font = new Font("Times new Roman", Font.ITALIC, 25);

    DefaultListModel dfm = new DefaultListModel();//Добавляет элементы по умолчанию
    JList myList = new JList(dfm);
    JScrollPane scrollPane = new JScrollPane(myList);

    buttonAdd.setIcon(new ImageIcon("table/add.png"));
    buttonAdd.setPreferredSize(new Dimension(16, 16));
    buttonAdd.setCursor(cursor);
    buttonAdd.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dfm.addElement(textField.getText());
        //dfm.removeElement(myList.getSelectedValue());
      }
    });

    buttonRemove.setIcon(new ImageIcon("table/x.png"));
    buttonRemove.setPreferredSize(new Dimension(16, 16));
    buttonRemove.setCursor(cursor);
    buttonRemove.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dfm.removeElement(myList.getSelectedValue());
      }
    });

    panelH.setPreferredSize(new Dimension(200, 50));
    panelH.setBackground(Color.cyan);

    panelScroll.setPreferredSize(new Dimension(600, 280));
    scrollPane.setPreferredSize(new Dimension(233, 100));
    label.setFont(font);

    panelH.add(label);
    panelButton.add(textField);
    panelButton.add(buttonAdd);
    panelButton.add(buttonRemove);
    panelScroll.add(scrollPane);

    frame.add(panelH, BorderLayout.NORTH);
    frame.add(panelButton, BorderLayout.CENTER);
    frame.add(panelScroll, BorderLayout.SOUTH);

    frame.setVisible(true);
  }


}
