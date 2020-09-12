package ch20_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DefaultButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickButton = (JButton) e.getSource();
		String clickButtonText = clickButton.getText();

		/* 초기화로 되어있던 0을 지운다. */
		if (RestButtonPanel.count == 0) {
			PushButtonLabelPanel.jLabel.setText(" ");
			RestButtonPanel.count++;
		}

		String oldText = CalculatorProcessLabelPanel.jLabel.getText();
		String newText = oldText + clickButtonText;

		CalculatorProcessLabelPanel.jLabel.setText(newText);

		
		if (!clickButtonText.equals("+") || !clickButtonText.equals("-") || !clickButtonText.equals("X") || !clickButtonText.equals("÷")) {

			int TextNum = oldText.length();
			Character FrontLastText = oldText.charAt(TextNum - 1);

			
			/* 바로 전에 눌렀던 버튼이 연산 기호면 PushButtonLabelPanel 패널이 새롭게 시작된다.*/
			if (FrontLastText == '+' || FrontLastText == '-' || FrontLastText == 'X'
					|| FrontLastText == '÷') {
				PushButtonLabelPanel.jLabel.setText(" ");
			}
			/* 바로 전에 눌렀던 버튼이 '=' 이면 PushButtonLabelPanel 패널이 새롭게 시작되고 누른 버튼을 CalculatorProcessLabelPanel 표시*/
			if (FrontLastText == '=') {
				PushButtonLabelPanel.jLabel.setText(" ");
				CalculatorProcessLabelPanel.jLabel.setText(clickButtonText);
			}

			SetPushButtonLabelPanel(clickButtonText);

		}
	}

	
	private void SetPushButtonLabelPanel(String clickButtonText) {
		String oldPushText = PushButtonLabelPanel.jLabel.getText();
		String newPushText = oldPushText + clickButtonText;

		PushButtonLabelPanel.jLabel.setText(newPushText);
	}

}
