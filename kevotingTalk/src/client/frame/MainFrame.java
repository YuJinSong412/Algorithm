package client.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import util.CommonPanel;

public class MainFrame extends JFrame{
	
	private MainPanel mainPanel;
	
	public MainFrame() {
		setTitle("kevotingTalk");
		setBounds(100,100,400,600);
		
		mainPanel = new MainPanel(this);
		getContentPane().add(mainPanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void change(JPanel panelName) {
		getContentPane().removeAll();
		getContentPane().add(panelName);
		revalidate();
		repaint();
	}
	

}
