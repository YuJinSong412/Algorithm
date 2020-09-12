package ch20_1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RestButtonPanel extends JPanel {

	final static int BUTTON_SIZE = 16;
	static int count;
	static int toggleCount;

	public RestButtonPanel() {

		setLayout(new GridLayout(4, 4));

		String[] buttonComponent = { "7", "8", "9", "X", "4", "5", "6", "-", "1", "2", "3", "+", "+/-", "0", ".", "=" };

		JButton[] calculatorButton = new JButton[BUTTON_SIZE];

		/* 계산기버튼-글씨 크기, 배경색 지정 */
		for (int i = 0; i < BUTTON_SIZE; i++) {
			calculatorButton[i] = new JButton(buttonComponent[i]);
			calculatorButton[i].setFont(calculatorButton[i].getFont().deriveFont(20f));
			calculatorButton[i].setBackground(Color.WHITE);

			if (i == BUTTON_SIZE - 1) {
				Color ResultButtonColor = new Color(255, 223, 0);
				calculatorButton[i].setBackground(ResultButtonColor);
			}
			add(calculatorButton[i]);

		}

		/* 버튼 구성들의 기능 적용 */
		for (int i = 0; i < BUTTON_SIZE; i++) {

			/* 버튼 1 ~ 9 눌렀을 때 */
			if (i % 4 != 3 && i < 12) {
				calculatorButton[i].addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						JButton clickButton = (JButton) e.getSource();
						String text = clickButton.getText();

						/* 초기화로 되어있던 0을 없앰 */
						if (count == 0) {
							PushButtonLabelPanel.jLabel.setText(" ");
							count++;
						}

						String oldText = CalculatorProcessLabelPanel.jLabel.getText();
						String newText = oldText + text;

						CalculatorProcessLabelPanel.jLabel.setText(newText);

						if (!text.equals("+") || !text.equals("-") || !text.equals("X") || !text.equals("÷")) {

							int TextNum = oldText.length();
							Character FrontLastText = oldText.charAt(TextNum - 1);

							if (FrontLastText == '+' || FrontLastText == '-' || FrontLastText == 'X'
									|| FrontLastText == '÷') {
								PushButtonLabelPanel.jLabel.setText(" ");
							}

							String oldPushText = PushButtonLabelPanel.jLabel.getText();
							String newPushText = oldPushText + text;

							PushButtonLabelPanel.jLabel.setText(newPushText);

						}
					}
				});
			}
			/* (+/-) 버튼 눌렀을 때 */
			else if (i == 12) {
				calculatorButton[i].addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						String text2 = CalculatorProcessLabelPanel.jLabel.getText();
						int index = 0;

						for (int i = text2.length() - 1; i >= 0; i--) {
							Character c = text2.charAt(i);
							if (c == '+' || c == '-' || c == 'X' || c == '÷' || text2.length() == 0) {
								index = i;
								break;
							}
						}
						String temp = text2;
						
//						Character c2 = text2.charAt(index);
//						String c2Text = c2.toString();
//						String newnewnew = text2.substring(0,index) +c2Text + text2.substring(index + 1);;

						String newnew = temp.substring(0, index+1) + "-"
								+ temp.substring(index + 1);
						
						
						String text = PushButtonLabelPanel.jLabel.getText();

						if (toggleCount % 2 == 0) {
							CalculatorProcessLabelPanel.jLabel.setText(newnew);
							PushButtonLabelPanel.jLabel.setText("-" + text);
						} else {
							CalculatorProcessLabelPanel.jLabel.setText(newnew.replace("-", ""));
				
							PushButtonLabelPanel.jLabel.setText(text.replace("-", ""));
						}
						toggleCount++;

					}
				});
			}
			/* 0 버튼 눌렀을 */
			else if (i == 13) {
				calculatorButton[i].addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						JButton clickButton = (JButton) e.getSource();
						String text = clickButton.getText();

						/* 초기화로 되어있던 0을 없앰 */
						if (count == 0) {
							PushButtonLabelPanel.jLabel.setText(" ");
							count++;
						}

						String oldText = CalculatorProcessLabelPanel.jLabel.getText();
						String newText = oldText + text;

						CalculatorProcessLabelPanel.jLabel.setText(newText);

						if (!text.equals("+") || !text.equals("-") || !text.equals("X") || !text.equals("÷")) {

							int TextNum = oldText.length();
							Character FrontLastText = oldText.charAt(TextNum - 1);

							if (FrontLastText == '+' || FrontLastText == '-' || FrontLastText == 'X'
									|| FrontLastText == '÷') {
								PushButtonLabelPanel.jLabel.setText(" ");
							}

							String oldPushText = PushButtonLabelPanel.jLabel.getText();
							String newPushText = oldPushText + text;

							PushButtonLabelPanel.jLabel.setText(newPushText);

						}

					}
				});
			} else if (i == 15) {
				calculatorButton[i].addActionListener(new CalcListener());
			} else if (i % 4 == 3) {
				calculatorButton[i].addActionListener(new MyListener());
			}
		}

	}

}
