package client.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import util.CommonPanel;

public class ErrorMessagePanel extends CommonPanel{
  
  JButton backButton;
  JLabel errorMessageLabel;
  Color buttonColor = new Color(94, 82, 82);
  
  public ErrorMessagePanel(String text) {
    
    showErrorMessage(text);
    backButton = goBackButton("뒤로가기");
    backButton.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        if(text.equals("회원가입")) {
          JoinMembershipPanel memPanel = new JoinMembershipPanel();
          MainPanel.frame.change(memPanel);
        }else if(text.equals("로그인")) {
          LoginPanel loginPanel = new LoginPanel();
          MainPanel.frame.change(loginPanel);
        }
      }
    });
  }
  
  public void showErrorMessage(String text) {
    errorMessageLabel = new JLabel(text +"이 실패했습니다.");
    errorMessageLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
    errorMessageLabel.setBounds(80,250,500,50);
    add(errorMessageLabel);
    
  }
  
  public JButton goBackButton(String text) {
    backButton = new JButton(text);
    backButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
    backButton.setForeground(Color.WHITE);
    backButton.setBackground(buttonColor);
    backButton.setBounds(100, 480, 180, 40);
    add(backButton);
    
    return backButton;
  };

}
