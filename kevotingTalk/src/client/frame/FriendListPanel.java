package client.frame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import client.ClientSocket;
import server.userDB.UserDAO;
import util.UseImageFile;
import util.UserProfileButton;

public class FriendListPanel extends JPanel{
  
  Color backgroundColor = new Color(233, 242, 255);
  JButton jButton;

  ArrayList<String> friends;  //친구들 이름 저장
  ArrayList<JButton> friendButtons = new ArrayList<JButton>();  //친구들 정보 버튼 저장
  
  final int FRIEND_MAX = 8;
  final int FRIEND_MIN = 1;
  
  int index;
  
  int indexxx;
  
  public FriendListPanel() {  
    setBackground(backgroundColor);

    UserDAO userDAO = new UserDAO();
    friends = userDAO.friendList();
    int friendNum = friends.size();
    
    setLayout(new GridLayout(friendNum, 0));
    
    for(index=0 ; index<friendNum; index++) {
      Random rand = new Random();
      int randomNum = rand.nextInt((FRIEND_MAX-FRIEND_MIN)+FRIEND_MIN)+1;
      Image img = UseImageFile.getImage("C:\\Users\\kev\\eclipse-workspace\\kevotingTalk\\src\\img\\friendProfile\\profile"+randomNum+".png");
      UserProfileButton userprofileButton = new UserProfileButton(new ImageIcon(img));
      userprofileButton.setText(friends.get(index));
      add(userprofileButton);
      
      friendButtons.add(userprofileButton);
    }
    
//    for(int i=0;i<friendNum;i++) {
//      friendButtons.get(i).addActionListener(new ActionListener() {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//          
//          ChatWindowPanel c = new ChatWindowPanel(friendButtons.get(indexxx++));
//          ChatWindowFrame j = new ChatWindowFrame(c);
//          
//          ClientSocket clientSocket = new ClientSocket();
//          clientSocket.startClient();
//        }
//        
//      });
//    }

    friendButtons.get(0).addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        
        ChatWindowPanel c = new ChatWindowPanel(friendButtons.get(0));
        ChatWindowFrame j = new ChatWindowFrame(c);
        
        ClientSocket clientSocket = new ClientSocket();
        
        clientSocket.send(UserDAO.username+"=>"+UserDAO.username + "님이 입장하였습니다.");
        
       // ChatWindowPanel.rightPrint(UserDAO.username +"님이 입장하였습니다.");
//        ClientSocket clientSocket = new ClientSocket();
//        clientSocket.startClient();
      }
      
    });
    
    friendButtons.get(1).addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        
        ChatWindowPanel c = new ChatWindowPanel(friendButtons.get(1));
        ChatWindowFrame j = new ChatWindowFrame(c);
        
        ClientSocket clientSocket = new ClientSocket();
        clientSocket.startClient();
      }
      
    });
    
    friendButtons.get(2).addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        
        ChatWindowPanel c = new ChatWindowPanel(friendButtons.get(2));
        ChatWindowFrame j = new ChatWindowFrame(c);
        
        ClientSocket clientSocket = new ClientSocket();
        clientSocket.startClient();
      }
      
    });

    

  }

}
