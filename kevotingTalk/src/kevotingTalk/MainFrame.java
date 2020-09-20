package kevotingTalk;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import util.CommonPanel;

public class MainFrame extends JFrame{

	public MainFrame() {
		setTitle("kevotingTalk");
		setBounds(100, 100, 400, 600);
		
		MiddlePanel mp = new MiddlePanel();
		getContentPane().add(BorderLayout.CENTER, mp);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void commonPanel() {
		CommonPanel com = new CommonPanel();
		getContentPane().add(com);
	}
}
