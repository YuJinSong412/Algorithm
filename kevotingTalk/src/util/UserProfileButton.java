package util;


import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class UserProfileButton extends JButton{

  Color buttonColor = new Color(233, 242, 255);
  
  public UserProfileButton(ImageIcon imgIcon) {
    setIcon(imgIcon);
    setFont(new Font("맑은 고딕", Font.BOLD, 18));
    setBackground(buttonColor);
    
    setHorizontalAlignment(SwingConstants.LEFT);
    setFocusPainted(false);
    
    Border emptyBorder = BorderFactory.createEmptyBorder();
    setBorder(emptyBorder);
    
  }
}

