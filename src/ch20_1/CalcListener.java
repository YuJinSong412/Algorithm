package ch20_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class CalcListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		String text = CalculatorProcessLabelPanel.jLabel.getText();
		double result = resultCalculator(text);

	}

	public double resultCalculator(String text) {

		int i;
		double ans;

		ArrayList<Double> v = new ArrayList<Double>();
		ArrayList<String> op = new ArrayList<String>();

		op.add(null);
		String str = new String("");

		for (i = 0; i < text.length(); i++) {
			Character c = text.charAt(i);

			if (Character.isDigit(c)) {
				String s = Character.toString(c);
				v.add(Double.parseDouble(s));

			}
		}
		System.out.println(v.get(0));

//    for (i = 0; i < text.length(); i++) {
//      Character c = text.charAt(i);
//      String s = Character.toString(c);
//
//      if (Character.isDigit(c)) { // 숫자인지 아닌지 확인하는 메소드
//      
//        str += Character.toString(c);
//        if (i == text.length() - 1)
//          v.add(Double.parseDouble(str));
//      } else if (s.equals("."))
//        str += s;
//      else {
//        v.add(Double.parseDouble(str));
//        op.add(Character.toString(c));
//        str = "";
//      }
//    }

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
			}
		}

		ans = v.get(0);
		for (i = 1; i < v.size(); i++) {
			String s = op.get(i);
			double n = v.get(i);

			if (s.compareTo("+") == 0)
				ans = ans + n;
			else if (s.compareTo("-") == 0)
				ans = ans - n;
		}

		return ans;
	}

}
