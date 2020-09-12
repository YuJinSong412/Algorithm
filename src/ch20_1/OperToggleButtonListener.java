package ch20_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperToggleButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String recordText = CalculatorProcessLabelPanel.jLabel.getText();
		int index = 0;

		for (int i = recordText.length() - 1; i >= 0; i--) {
			Character oneCharacter = recordText.charAt(i);
			if (oneCharacter == '+' || oneCharacter == '-' || oneCharacter == 'X' || oneCharacter == '÷'
					|| recordText.length() == 0) {
				index = i;
				break;
			}
		}
		String temp = recordText;

		String newRecordText = temp.substring(0, index + 1) + "-" + temp.substring(index + 1);

		String text = PushButtonLabelPanel.jLabel.getText();

		if (RestButtonPanel.toggleCount % 2 == 0) {
			CalculatorProcessLabelPanel.jLabel.setText(newRecordText);
			PushButtonLabelPanel.jLabel.setText("-" + text);
		} else {
			CalculatorProcessLabelPanel.jLabel.setText(newRecordText.replace("-", ""));

			PushButtonLabelPanel.jLabel.setText(text.replace("-", ""));
		}
		RestButtonPanel.toggleCount++;

	}

}
