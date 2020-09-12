package ch20_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class CalcListener implements ActionListener {


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

		int i;
		double ans;

		ArrayList<Double> v = new ArrayList<Double>();
		ArrayList<String> op = new ArrayList<String>();

//		if(text.charAt(0) == '-') {
//			op.add(Character.toString(text.charAt(0)));
//		}else {
			op.add(null);
			
	//	}
		String str = new String("");

		for (i = 0; i < text.length(); i++) {
			Character c = text.charAt(i);
			String s = Character.toString(c);
	
			if (Character.isDigit(c)) { // 숫자인지 아닌지 확인하는 메소드
				str += s;
				if (i == text.length() - 1) {
					v.add(Double.parseDouble(str));
				}
			} else if (s.equals(".")) {
				str += s;
			} else {
				v.add(Double.parseDouble(str));
				op.add(Character.toString(c));
				str = "";
			}
		}

		for (i = 1; i < v.size(); i++) {
			String s = op.get(i);
			double tmp;

			if (s.equals("X")) {
				tmp = v.get(i - 1) * v.get(i);
				op.remove(i);
				v.remove(i);
				v.remove(i - 1);
				v.add(i - 1, tmp);
				i--;
			} else if (s.equals("÷")) {
				tmp = v.get(i - 1) / v.get(i);
				op.remove(i);
				v.remove(i);
				v.remove(i - 1);
				v.add(i - 1, tmp);
				i--;
			} else if(s.equals("%")) {
				tmp = v.get(i-1) % v.get(i);
				op.remove(i);
				v.remove(i);
				v.remove(i-1);
				v.add(i-1, tmp);
				i--;
			}
		}

		ans = v.get(0);
		for (i = 1; i < v.size(); i++) {
			String s = op.get(i);
			double n = v.get(i);

			if (s.equals("+"))
				ans = ans + n;
			else if (s.equals("-"))
				ans = ans - n;
		}

		return ans;
	}

}
