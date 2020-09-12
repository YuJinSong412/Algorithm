package ch20_1;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class HistoryPanel extends JPanel {

	static JTextArea text;

	static String historyText="";
	
	public HistoryPanel() {
		text = new JTextArea(10, 20);
		text.setEditable(false);
		add(text);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		setBorder(new TitledBorder(new EtchedBorder(), "계산 기록"));

		Color color = new Color(251, 255, 135);
		setBackground(color);
	}
	
	public static void printHistoryText(String resultCal) {
		historyText += resultCal+"\n";
		text.setText(historyText);
		
	}

}