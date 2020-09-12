package ch20_1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class LabelPanel extends JPanel {

	public LabelPanel() {
		Color color = new Color(251, 255, 135);
		setBackground(color);

		GridBagConstraints[] dividePanel = new GridBagConstraints[2];
		GridBagLayout gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);

		/* 계산 과정 보이는 패널 */
		dividePanel[0] = new GridBagConstraints();
		dividePanel[0].gridx = 0;
		dividePanel[0].gridy = 0;
		dividePanel[0].weightx = 1;
		dividePanel[0].weighty = 1;
		dividePanel[0].fill = GridBagConstraints.BOTH;
		CalculatorProcessLabelPanel CalProcessPanel = new CalculatorProcessLabelPanel();
		add(CalProcessPanel, dividePanel[0]);

		/* 숫자버튼 누르면 숫자만 보이는 패널 */
		dividePanel[1] = new GridBagConstraints();
		dividePanel[1].gridx = 0;
		dividePanel[1].gridy = 1;
		dividePanel[1].gridheight = 2;
		dividePanel[1].weightx = 1;
		dividePanel[1].weighty = 1;
		dividePanel[1].fill = GridBagConstraints.BOTH;
		PushButtonLabelPanel pushButtonPanel = new PushButtonLabelPanel();
		add(pushButtonPanel, dividePanel[1]);

	}

}
