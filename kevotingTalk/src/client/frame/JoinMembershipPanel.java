package client.frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import server.userDB.User;
import server.userDB.UserDAO;
import util.CommonWord;

public class JoinMembershipPanel extends userInfoPanel {

  private final String SIGN_UP = "가입하기";
  
  ArrayList<JTextField> userInfos = new ArrayList<JTextField>();
  
  User user;

  public JoinMembershipPanel() {
    titleForm(CommonWord.SIGN_UP_MEMBERSHIP.getText());

    writeUserInfo();

    JButton signupButton = signupButton(SIGN_UP);
    
    signupButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        user = new User(userInfos.get(0).getText(), userInfos.get(1).getText(),userInfos.get(2).getText());

        UserDAO userDAO = new UserDAO();
        userDAO.insertDB(user);
        
      }
      
    });
    

  }


  public void writeUserInfo() {
    int y_value = 155;
    for (CommonWord commonWord : CommonWord.values()) {
      if(commonWord.getNum() >= 2 && commonWord.getNum() <=4){
        membershipLabel = new JLabel(commonWord.getText());
        membershipLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
        membershipLabel.setBounds(30, y_value, 200, 50);
        add(membershipLabel);

        userInfoTextField = new JTextField(10);
        userInfoTextField.setBounds(30, y_value + 45, 325, 30);
        add(userInfoTextField);
        y_value += 100;
        
        userInfos.add(userInfoTextField);
      } else {
        continue;
      }
    }
  }

}
