package client.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import util.CommonPanel;
import util.CommonWord;

public class JoinMembershipPanel extends CommonPanel {

	private final String SIGN_UP = "가입하기";
	private JLabel membershipLabel;
	private JTextField userInfoTextField;
	private JButton signupButton;

	Color buttonColor = new Color(94, 82, 82);

	public JoinMembershipPanel() {
		titleForm(CommonWord.SIGN_UP_MEMBERSHIP.getText());

		writeUserInfo();

		signupButton(SIGN_UP);

	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		Line2D lin = new Line2D.Float(30, 145, 350, 145);
		g2.draw(lin);
	}

	private void titleForm(String text) {
		membershipLabel = new JLabel(text);
		membershipLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		membershipLabel.setBounds(30, 100, 200, 50);
		add(membershipLabel);
	}

	private void writeUserInfo() {
		int y_value = 155;
		for (CommonWord commonWord : CommonWord.values()) {
			if (commonWord.getNum() == 0 || commonWord.getNum() == 1) {
				continue;
			} else {
				membershipLabel = new JLabel(commonWord.getText());
				membershipLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
				membershipLabel.setBounds(30, y_value, 200, 50);
				add(membershipLabel);

				userInfoTextField = new JTextField(10);
				userInfoTextField.setBounds(30, y_value + 45, 325, 30);
				add(userInfoTextField);
				y_value += 100;
			}
		}
	}

	private void signupButton(String text) {
		signupButton = new JButton(text);
		signupButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		signupButton.setForeground(Color.WHITE);
		signupButton.setBackground(buttonColor);
		signupButton.setBounds(100, 480, 180, 40);
		add(signupButton);
	}
}
