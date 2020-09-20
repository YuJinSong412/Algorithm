package client.frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import util.CommonPanel;

abstract class userInfoPanel extends CommonPanel{

	public JLabel membershipLabel;
	public JTextField userInfoTextField;
	public JButton signupButton;
	
	Color buttonColor = new Color(94, 82, 82);
	
	abstract void titleForm(String text);
	abstract void writeUserInfo();
	abstract void signupButton(String text);
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		Line2D lin = new Line2D.Float(30, 145, 350, 145);
		g2.draw(lin);
	}
}
