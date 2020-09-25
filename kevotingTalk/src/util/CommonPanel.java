package util;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CommonPanel extends JPanel{
  Color color = new Color(233, 242, 255);
  JLabel logoLabel;
  Image logoImg = UseImageFile.getImage("C:\\Users\\kev\\eclipse-workspace\\kevotingTalk\\src\\img\\label.png");
  
  public CommonPanel() {
    setBackground(color);
    setLayout(null);
    
    logoLabel = new JLabel(new ImageIcon(logoImg));
    logoLabel.setBounds(-30, 0, 200, 50);
    add(logoLabel);
  }
  
}
