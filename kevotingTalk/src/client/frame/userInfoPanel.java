package client.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import util.CommonPanel;

 abstract class userInfoPanel extends CommonPanel {

  JLabel membershipLabel;
  JTextField userInfoTextField;
  JButton signupButton;

  Color buttonColor = new Color(94, 82, 82);

  abstract void writeUserInfo();
  
  public void titleForm(String text) {
    membershipLabel = new JLabel(text);
    membershipLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
    membershipLabel.setBounds(30, 100, 200, 50);
    add(membershipLabel);
  };


  public JButton signupButton(String text) {
    signupButton = new JButton(text);
    signupButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
    signupButton.setForeground(Color.WHITE);
    signupButton.setBackground(buttonColor);
    signupButton.setBounds(100, 480, 180, 40);
    add(signupButton);
    
    return signupButton;
  };

  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    Line2D lin = new Line2D.Float(30, 145, 350, 145);
    g2.draw(lin);
  }
}
