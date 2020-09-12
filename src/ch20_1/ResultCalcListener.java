package ch20_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class ResultCalcListener implements ActionListener {

	int index;
	double answerResult;

	ArrayList<Double> number;
	ArrayList<String> operation;

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton clickButton = (JButton) e.getSource();
		String textClick = clickButton.getText();

		String text = CalculatorProcessLabelPanel.jLabel.getText();

		text = text.trim();
		double result = resultCalculator(text);

		PushButtonLabelPanel.jLabel.setText(Double.toString(result));

		HistoryPanel.printHistoryText(text + textClick + Double.toString(result));

		String oldText = CalculatorProcessLabelPanel.jLabel.getText();
		String newText = oldText + textClick;

		CalculatorProcessLabelPanel.jLabel.setText(newText);

	}

	public double resultCalculator(String text) {

		addArrayList(text);

//		for (index = 1; index < number.size(); index++) {
//			String oneOperation = operation.get(index);
//			double tmp = 0;
//
//			if (oneOperation.equals("X")) {
//				tmp = number.get(index - 1) * number.get(index);
//				operation.remove(index);
//				number.remove(index);
//				number.remove(index - 1);
//				number.add(index - 1, tmp);
//				index--;
//			} else if (oneOperation.equals("÷")) {
//				tmp = number.get(index - 1) / number.get(index);
//				operation.remove(index);
//				number.remove(index);
//				number.remove(index - 1);
//				number.add(index - 1, tmp);
//				index--;
//			} else if (oneOperation.equals("%")) {
//				tmp = number.get(index - 1) % number.get(index);
//				operation.remove(index);
//				number.remove(index);
//				number.remove(index - 1);
//				number.add(index - 1, tmp);
//				index--;
//			}
//
//			// calculator(oneOperation);
//
//		}
		
		calculator();

		answerResult = number.get(0);
		for (index = 1; index < number.size(); index++) {
			String oneOperation = operation.get(index);
			double oneNumber = number.get(index);

			if (oneOperation.equals("+"))
				answerResult = answerResult + oneNumber;
			else if (oneOperation.equals("-"))
				answerResult = answerResult - oneNumber;
		}

		return answerResult;
	}

	private void addArrayList(String text) {
		number = new ArrayList<Double>();
		operation = new ArrayList<String>();

		operation.add(null);

		String str = new String("");

		for (index = 0; index < text.length(); index++) {
			Character oneCharacter = text.charAt(index);
			String oneCharacterToString = Character.toString(oneCharacter);

			if (Character.isDigit(oneCharacter)) { // 숫자인지 아닌지 확인하는 메소드
				str += oneCharacterToString;
				if (index == text.length() - 1) {
					number.add(Double.parseDouble(str));
				}
			} else if (oneCharacterToString.equals(".")) {
				str += oneCharacterToString;
			} else {
				number.add(Double.parseDouble(str));
				operation.add(Character.toString(oneCharacter));
				str = "";
			}
		}
	}

	private void calculator() {
		for (index = 1; index < number.size(); index++) {
			String oneOperation = operation.get(index);
			double tmp = 0;

			if (oneOperation.equals("X")) {
				tmp = number.get(index - 1) * number.get(index);
				operation.remove(index);
				number.remove(index);
				number.remove(index - 1);
				number.add(index - 1, tmp);
				index--;
			} else if (oneOperation.equals("÷")) {
				tmp = number.get(index - 1) / number.get(index);
				operation.remove(index);
				number.remove(index);
				number.remove(index - 1);
				number.add(index - 1, tmp);
				index--;
			} else if (oneOperation.equals("%")) {
				tmp = number.get(index - 1) % number.get(index);
				operation.remove(index);
				number.remove(index);
				number.remove(index - 1);
				number.add(index - 1, tmp);
				index--;
			}

//			operation.remove(index);
//			number.remove(index);
//			number.remove(index - 1);
//			number.add(index - 1, tmp);
//			index--;
			
			// calculator(oneOperation);

		}

	}

}
