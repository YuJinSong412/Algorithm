package ch20_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastTextRemoveListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int removeLastText = CalculatorProcessLabelPanel.jLabel.getText().length() - 1;

		if (removeLastText == 0) {
			CalculatorProcessLabelPanel.jLabel.setText(" ");
		} else {
			CalculatorProcessLabelPanel.jLabel
					.setText(CalculatorProcessLabelPanel.jLabel.getText().substring(0, removeLastText));

		}
	}

}
