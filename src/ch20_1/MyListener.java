package ch20_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {

		JButton button = (JButton) e.getSource();
		int TextNum = CalculatorProcessLabelPanel.jLabel.getText().length();

		Character FrontLastText = CalculatorProcessLabelPanel.jLabel.getText().charAt(TextNum - 1);

		if (FrontLastText != '+' && FrontLastText != '-' && FrontLastText != 'X' && FrontLastText != '÷' && FrontLastText != '%') {
			String oldtext = CalculatorProcessLabelPanel.jLabel.getText();
			String text = button.getText();
			String newtext = oldtext + text;
			CalculatorProcessLabelPanel.jLabel.setText(newtext);

		}

	}
}
