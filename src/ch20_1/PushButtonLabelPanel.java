package ch20_1;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PushButtonLabelPanel extends JPanel {

	static JLabel jLabel;

	public PushButtonLabelPanel() {

		jLabel = new JLabel("0");
		add(jLabel);

		jLabel.setFont(jLabel.getFont().deriveFont(35f));

		Color color = new Color(251, 255, 135);
		setBackground(color);

	}

}
