package client.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import server.userDB.UserDAO;

public class ChatWindowFrame extends JFrame{
  
  
  public ChatWindowFrame(JPanel panel) {
    setTitle(UserDAO.username+"의 Chatting");
    setBounds(200,200,405,605);
    
    getContentPane().add(panel);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

}
