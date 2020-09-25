package client.frame;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import util.CommonWord;
import util.MainPanelButton;
import util.UseImageFile;



public class MainPanel extends JPanel{
  
  Image img = UseImageFile.getImage("C:\\Users\\kev\\eclipse-workspace\\kevotingTalk\\src\\img\\logoicon.png");
  JLabel logoImgLabel;
  MainPanelButton mainButton;
  Color color = new Color(233, 242, 255);
  
  public static MainFrame frame;
  
  
  public MainPanel(MainFrame frame) {
    MainPanel.frame = frame;
    
    setBackground(color);
    setLayout(null);
    logoImgLabel = new JLabel(new ImageIcon(img));
    logoImgLabel.setBounds(95, 90, 200, 200);
    add(logoImgLabel);

    mainButton = new MainPanelButton(CommonWord.SIGN_UP_MEMBERSHIP.getText());
    mainButton.setBounds(30, 370, 330, 35);
    add(mainButton);
    mainButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        JoinMembershipPanel c = new JoinMembershipPanel();
        MainPanel.frame.change(c);
        
      }
      
    });
    
    mainButton = new MainPanelButton(CommonWord.LOGIN.getText());
    mainButton.setBounds(30, 420, 330, 35);
    add(mainButton);
    mainButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        LoginPanel loginPanel = new LoginPanel();
        MainPanel.frame.change(loginPanel);
      }
      
    });
  }

}
