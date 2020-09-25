package client.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import server.userDB.UserDAO;
import util.CommonPanel;
import util.CommonWord;
import util.UseImageFile;
import util.UserProfileButton;

public class IndexPanel extends CommonPanel{

  JLabel jLabel;
  JButton jButton;

  Color buttonColor = new Color(233, 242, 255);
  
  Image img = UseImageFile.getImage("C:\\Users\\kev\\eclipse-workspace\\kevotingTalk\\src\\img\\woman.png");
  //String uname;
  
  public IndexPanel() {  //String uname

  //  this.uname = uname;
    
    meanMyProfileTitle(CommonWord.MYPROFILE.getText());
    
    meanMyProfile();
    
    meanFriendProfileTitle(CommonWord.FRIEND.getText());
    
    showFriendList();
  
  }
  
  private void meanMyProfileTitle(String text) {
    jLabel = new JLabel(text);
    jLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
    jLabel.setBounds(30, 80, 200, 30);
    add(jLabel);
    
  }
  
  private void meanMyProfile() {
    UserProfileButton userProfileButton = new UserProfileButton(new ImageIcon(img));
    userProfileButton.setText(UserDAO.username);
    userProfileButton.setBounds(30, 120, 325, 80);
    add(userProfileButton);
    
    userProfileButton.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        
        
      }
      
    });
  }
  
  private void meanFriendProfileTitle(String text) {
    jLabel = new JLabel(text);
    jLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
    jLabel.setBounds(30, 220, 200, 30);
    add(jLabel);
  }
  
  private void showFriendList() {
    FriendListPanel jpanel = new FriendListPanel();  //userDAO.username
    JScrollPane scroller = new JScrollPane(jpanel);
    scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    scroller.setBounds(30, 250, 325, 300);
    add(scroller);
  }
  
  
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    Line2D lin = new Line2D.Float(30, 210, 350, 210);
    g2.draw(lin);
  }
}
