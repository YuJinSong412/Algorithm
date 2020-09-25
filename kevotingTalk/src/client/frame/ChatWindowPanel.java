package client.frame;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.net.ServerSocket;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import client.ClientSocket;
import server.ServerLaunch;
import server.userDB.UserDAO;
import util.UseImageFile;

public class ChatWindowPanel extends JPanel{
  
  Color color = new Color(233, 242, 255);
  Color sendColor = new Color(209, 206, 206);

  JTextArea textArea;
  JButton sendButton;
  
  static JTextArea textArea2;
  
  Image img = UseImageFile.getImage("C:\\Users\\kev\\eclipse-workspace\\kevotingTalk\\src\\img\\picture.png");
  Image img2 = UseImageFile.getImage("C:\\Users\\kev\\eclipse-workspace\\kevotingTalk\\src\\img\\folder.png");
  
  public ChatWindowPanel(JButton button) {
    setBackground(color);
    setLayout(null);
    
    button.setBounds(0, 0, 400, 80);
    button.setBackground(Color.WHITE);
    add(button);
    
    textArea = new JTextArea(20,20);
    JScrollPane scroller = new JScrollPane(textArea);
    scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    scroller.setBounds(0, 500, 321,65);
    add(scroller);
    
    
    JButton imgButton = new JButton(new ImageIcon(img));
    imgButton.setBackground(color);
    Border emptyBorder = BorderFactory.createEmptyBorder();
    imgButton.setBorder(emptyBorder);
    imgButton.setFocusPainted(false);
    imgButton.setBounds(0, 460, 60, 40);
    add(imgButton);
    
    JButton imgButton2 = new JButton(new ImageIcon(img2));
    imgButton2.setBackground(color);
    Border emptyBorder2 = BorderFactory.createEmptyBorder();
    imgButton2.setBorder(emptyBorder2);
    imgButton2.setFocusPainted(false);
    imgButton2.setBounds(60, 460, 60, 40);
    
    
    add(imgButton2);
    imgButton2.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images","jpg", "gif");
        chooser.setFileFilter(filter);
        
        int ret = chooser.showOpenDialog(null);
        if(ret != JFileChooser.APPROVE_OPTION) {
          JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
          return;
        }
        
        String filePath = chooser.getSelectedFile().getAbsolutePath();
        
      }
      
    });
    
    
    
    textArea2 = new JTextArea(20,20);
    textArea2.setBackground(color);
    JScrollPane scroller2 = new JScrollPane(textArea2);
    scroller2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    scroller2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    scroller2.setBounds(0, 80, 389,380);
    add(scroller2);
        
    sendButton = new JButton("전송");
    sendButton.setBackground(sendColor);
    sendButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
    sendButton.setFocusPainted(false);
    sendButton.setBounds(320, 500, 68, 65);
    add(sendButton);
    sendButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
  
        //displayText(textArea.getText());
        
        ClientSocket clientSocket = new ClientSocket();
        clientSocket.send(textArea.getText());
        
      }
      
    });
    
  }
  
  public static void displayText(String text) {
    textArea2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
    textArea2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    textArea2.append(text+"\n");
  }
  
  public static void displayText2(String text) {
    if("송유진".equals(UserDAO.username)) {
      textArea2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
      textArea2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
      textArea2.append(text+"\n");
    }else {
      textArea2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
      //textArea2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
      textArea2.append(text+"\n");
      
    }
  }
  
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    Line2D lin = new Line2D.Float(0, 81, 400, 81);
    g2.draw(lin);
    
    Graphics2D g3 = (Graphics2D) g;
    Line2D lin2 = new Line2D.Float(0, 458, 400, 458);
    g3.draw(lin2);
  }
  

}
