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
				calculatorButton[i].addActionListener(new DefaultButtonListener());
			}
			/* (+/-) 버튼 눌렀을 때 */
			else if (i == 12) {
				calculatorButton[i].addActionListener(new OperToggleButtonListener());
			}
			/* 0, '.' 버튼 눌렀을 때 */
			else if (i == 13 || i == 14) {
				calculatorButton[i].addActionListener(new DefaultButtonListener());
			} 
			/* '='버튼 눌렀을 때 */
			else if (i == 15) {
				calculatorButton[i].addActionListener(new ResultCalcListener());
			} 
			/*연산기호 버튼 눌렀을 때 */
			else if (i % 4 == 3) {
				calculatorButton[i].addActionListener(new OperationListener());
			} 

		}

	}

}

