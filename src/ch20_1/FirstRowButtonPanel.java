package ch20_1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FirstRowButtonPanel extends JPanel {

	final static int BUTTON_SIZE = 5;

	public FirstRowButtonPanel() {

		String[] buttonComponent = { "%", "CE", "C", "⬅", "÷" };

		JButton[] calculatorButton = new JButton[BUTTON_SIZE];
		GridBagConstraints[] gridBagConstraints = new GridBagConstraints[BUTTON_SIZE];

		GridBagLayout gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);

		/* 계산기버튼-글씨 크기, 배경색 지정, 버튼 크기 지 */
		for (int i = 0; i < BUTTON_SIZE; i++) {
			calculatorButton[i] = new JButton(buttonComponent[i]);
			calculatorButton[i].setFont(calculatorButton[i].getFont().deriveFont(20f));
			gridBagConstraints[i] = new GridBagConstraints();

			if (i == 4) {
				int j = i - 1;
				gridBagConstraints[i].gridx = j;
				gridBagConstraints[i].gridy = j;
				gridBagConstraints[i].gridwidth = 1;
				gridBagConstraints[i].gridheight = 1;
			} else {
				gridBagConstraints[i].gridx = i;
				gridBagConstraints[i].gridy = 2;
				gridBagConstraints[i].gridwidth = 1;
				if (i == 3) {
					gridBagConstraints[i].gridheight = 1;
				} else {
					gridBagConstraints[i].gridheight = 2;
				}
			}

			gridBagConstraints[i].weightx = 1;
			gridBagConstraints[i].weighty = 1;
			gridBagConstraints[i].fill = GridBagConstraints.BOTH;
			calculatorButton[i].setBackground(Color.WHITE);
			add(calculatorButton[i], gridBagConstraints[i]);
		}

		
		/*각 버튼 기능 적용 */
		for(int i = 0 ;i<calculatorButton.length;i++) {
			if(i == 0 || i == 4) {
				calculatorButton[i].addActionListener(new OperationListener());	//기호는 연속으로 입력 안되게 
			} else if(i == 1) {
				calculatorButton[i].addActionListener(new DegreeOfDeleteListener(false));	// 전체 삭제 노노
			} else if(i == 2) {
				calculatorButton[i].addActionListener(new DegreeOfDeleteListener(true));	//기록 전체도 삭제.
			} else if(i == 3) {
				calculatorButton[3].addActionListener(new LastTextRemoveListener());	//마지막 문자 삭제.

			}
		}
		

	}

}