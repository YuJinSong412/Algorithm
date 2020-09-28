package client;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public class example {
  static JTextPane jtp;

  static Style style;

  static Style style2;

  static StyleContext context;

  static StyledDocument document;

  public static void main(String[] args) {

    JFrame frame = new JFrame("자바강좌");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    context = new StyleContext();
    document = new DefaultStyledDocument(context);
    jtp = new JTextPane(document);
    JScrollPane scroll = new JScrollPane(jtp);
    frame.add(scroll);

    leftPrint("왜왜왜");
    print("야야야");
    leftPrint("제발");
    print("되어라");

    frame.setSize(300, 300);
    frame.setVisible(true);
  }

  private static void leftPrint(String string) {

    try {
      SimpleAttributeSet right = new SimpleAttributeSet(); 
      StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT); 
      document.setParagraphAttributes(document.getLength(), document.getLength()+1, right, true);
      document.insertString(document.getLength(), string + "\n", right);
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
  }

  private static void print(String string) {

    try {
      SimpleAttributeSet left = new SimpleAttributeSet(); 
      StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT); 
      document.setParagraphAttributes(document.getLength(), document.getLength()+1, left, true);
      document.insertString(document.getLength(), string + " \n", left);
    } catch (BadLocationException e) {
      e.printStackTrace();
    }
  }
}