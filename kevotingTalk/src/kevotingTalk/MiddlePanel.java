package kevotingTalk;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class MiddlePanel extends JPanel {

	private final String ACCOUNT = "회원가입";
	private final String LOGIN = "로그인";

	public MiddlePanel() {
		Color color = new Color(233, 242, 255);
		setBackground(color);
		setLayout(null);

		Image img = TalkIcon.Image();
		JLabel jlabel = new JLabel(new ImageIcon(img));

		jlabel.setBounds(95, 90, 200, 200);
		add(jlabel);

		JButton jButton = new JButton(ACCOUNT);
		jButton.setBackground(Color.WHITE);
		jButton.setFocusPainted(false);
		jButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		jButton.setBounds(30, 370, 330, 35);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		jButton.setBorder(emptyBorder);
		add(jButton);
		//jButton.addActionListener(AccountListener);
		
		
		JButton jButton2 = new JButton(LOGIN);
		jButton2.setBackground(Color.WHITE);
		jButton2.setFocusPainted(false);
		jButton2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		jButton2.setBounds(30, 420, 330, 35);
		Border emptyBorder2 = BorderFactory.createEmptyBorder();
		jButton2.setBorder(emptyBorder2);
		add(jButton2);
	}
}
