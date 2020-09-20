package client.frame;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import util.CommonWord;

public class LoginPanel extends userInfoPanel{

	private final String LOGIN = "로그인";
	
	public LoginPanel() {
		titleForm(CommonWord.LOGIN.getText());
		
		writeUserInfo();
		
		signupButton(LOGIN);
	}

	public void writeUserInfo() {
		int y_value = 155;
		for (CommonWord commonWord : CommonWord.values()) {
			if (commonWord.getNum() == 3 || commonWord.getNum() == 4) {
				membershipLabel = new JLabel(commonWord.getText());
				membershipLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
				membershipLabel.setBounds(30, y_value, 200, 50);
				add(membershipLabel);
				
				userInfoTextField = new JTextField(10);
				userInfoTextField.setBounds(30, y_value + 45, 325, 30);
				add(userInfoTextField);
				y_value += 100;
				
			} else {
				continue;
			}
		}
	}

}
