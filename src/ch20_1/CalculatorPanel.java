package ch20_1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

public class CalculatorPanel extends JPanel {

	public CalculatorPanel() {

		GridBagConstraints[] dividePanel = new GridBagConstraints[3];
		GridBagLayout gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);

		/* Label 나오는 패널 */
		dividePanel[0] = new GridBagConstraints();
		dividePanel[0].gridx = 0;
		dividePanel[0].gridy = 0;
		dividePanel[0].gridheight = 2;
		dividePanel[0].weightx = 1;
		dividePanel[0].weighty = 1;
		dividePanel[0].fill = GridBagConstraints.BOTH;
		LabelPanel labelPanel = new LabelPanel();
		add(labelPanel, dividePanel[0]);

		
		/* 버튼 첫 행을 나타내는 패널 */
		dividePanel[1] = new GridBagConstraints();
		dividePanel[1].gridx = 0;
		dividePanel[1].gridy = 2;
		dividePanel[1].gridheight = 1;
		dividePanel[1].weightx = 1;
		dividePanel[1].weighty = 1;
		dividePanel[1].fill = GridBagConstraints.BOTH;
		FirstRowButtonPanel firstRowButtonPanel = new FirstRowButtonPanel();
		add(firstRowButtonPanel, dividePanel[1]);

		
		/* 나머지 버튼 나타내는 패널 */
		dividePanel[2] = new GridBagConstraints();
		dividePanel[2].gridx = 0;
		dividePanel[2].gridy = 3;
		dividePanel[2].gridheight = 3;
		dividePanel[2].weightx = 1;
		dividePanel[2].weighty = 1;
		dividePanel[2].fill = GridBagConstraints.BOTH;
		RestButtonPanel restButtonPanel = new RestButtonPanel();
		add(restButtonPanel, dividePanel[2]);

	}
}
