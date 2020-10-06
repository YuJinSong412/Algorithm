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
import java.util.HashMap;
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
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
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
  
  static JTextPane jtp;
  
  static Style style;

 // static Style style2;

  static StyleContext context;

  static StyledDocument document;
  
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

    
    JButton imgButton2 = new JButton(new ImageIcon(img2));
    imgButton2.setBackground(color);
    Border emptyBorder2 = BorderFactory.createEmptyBorder();
    imgButton2.setBorder(emptyBorder2);
    imgButton2.setFocusPainted(false);
    imgButton2.setBounds(0, 460, 60, 40);
    
    
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
        textArea.setText(filePath);
        
      }
      
    });
    
    
    context = new StyleContext();
    document = new DefaultStyledDocument(context);
    jtp = new JTextPane(document);
    jtp.setBackground(color);
    jtp.setEditable(false);
    JScrollPane scroller2 = new JScrollPane(jtp);
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
  
        ClientSocket clientSocket = new ClientSocket();
        
        clientSocket.send(UserDAO.username + "=>" + textArea.getText());
        
        textArea.setText("");
      }
      
    });
    
  }

  public static void ex(String data) {
    
  }
  
  public static void displayText(String data) {
    
  String[] info = data.split("=>");
    
  if(info[0].equals(UserDAO.username)) {
   ChatWindowPanel.rightPrint(info[1]);
  }else {
    ChatWindowPanel.leftPrint(info[1]);
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
  

  public static void rightPrint(String string) {
    
    try {
      SimpleAttributeSet right = new SimpleAttributeSet(); 
      
//      StyleContext context = new StyleContext();
//      StyledDocument document = new DefaultStyledDocument(context);
//      Style style = context.getStyle(StyleContext.DEFAULT_STYLE);
//      StyleConstants.setFontSize(style, 18);
//      StyleConstants.setForeground(style, Color.CYAN);
//      
      StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT); 
      document.setParagraphAttributes(document.getLength(), document.getLength()+1, right, true);
      document.insertString(document.getLength(), string + "\n", right);
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
  }
  
  public static void leftPrint(String string) {
    
    try {
      SimpleAttributeSet left = new SimpleAttributeSet(); 
//      
//      StyleContext context = new StyleContext();
//      StyledDocument document = new DefaultStyledDocument(context);
//      Style style = context.getStyle(StyleContext.DEFAULT_STYLE);
//      StyleConstants.setFontSize(style, 18);
//      StyleConstants.setForeground(style, Color.CYAN);
//      
      StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT); 
      document.setParagraphAttributes(document.getLength(), document.getLength()+1, left, true);
      document.insertString(document.getLength(), string + " \n", left);
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
  }
}
