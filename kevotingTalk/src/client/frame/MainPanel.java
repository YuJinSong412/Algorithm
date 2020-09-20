package client.frame;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

import util.CommonPanel;
import util.CommonWord;
import util.MainPanelButton;
import util.TalkIcon;



public class MainPanel extends JPanel{
	
	Image img = TalkIcon.getImage("C:\\Users\\songi\\Documents\\icon.png");
	JLabel logoImgLabel;
	MainPanelButton mainButton;
	Color color = new Color(233, 242, 255);
	
	
	
	
	public MainPanel(MainFrame frame) {
		setBackground(color);
		setLayout(null);
		logoImgLabel = new JLabel(new ImageIcon(img));
		logoImgLabel.setBounds(95, 90, 200, 200);
		add(logoImgLabel);

		mainButton = new MainPanelButton(CommonWord.SIGN_UP_MEMBERSHIP.getText());
		mainButton.setBounds(30, 370, 330, 35);
		add(mainButton);
		mainButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JoinMembershipPanel c = new JoinMembershipPanel();
				frame.change(c);
				
			}
			
		});
		
		mainButton = new MainPanelButton(CommonWord.LOGIN.getText());
		mainButton.setBounds(30, 420, 330, 35);
		add(mainButton);
		mainButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LoginPanel loginPanel = new LoginPanel();
				frame.change(loginPanel);
			}
			
		});
	}

}
