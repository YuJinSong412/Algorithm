package ch20_1;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorProcessLabelPanel extends JPanel {

	static JLabel jLabel;

	public CalculatorProcessLabelPanel() {

		jLabel = new JLabel(" ");
		jLabel.setFont(jLabel.getFont().deriveFont(17f));
		add(jLabel);

		Color color = new Color(251, 255, 135);
		setBackground(color);

	}
}
