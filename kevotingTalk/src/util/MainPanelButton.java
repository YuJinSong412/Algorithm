package util;


import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public class MainPanelButton extends JButton{
  
  Border emptyBorder;
  
  public MainPanelButton(String buttonTitle) {
    
    setName(buttonTitle);
    setText(buttonTitle);
    setBackground(Color.WHITE);
    setFocusPainted(false);
    setFont(new Font("맑은 고딕", Font.BOLD, 18));
    
    emptyBorder = BorderFactory.createEmptyBorder();
    setBorder(emptyBorder);
  }

  @Override
  public void setBounds(int x, int y, int width, int height) {
    super.setBounds(x, y, width, height);
  }
  
  
}

