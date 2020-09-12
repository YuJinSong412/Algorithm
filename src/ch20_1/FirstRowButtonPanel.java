package ch20_1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

		for (int i = 0; i < BUTTON_SIZE; i++) {
			calculatorButton[i] = new JButton(buttonComponent[i]);
			calculatorButton[i].setFont(calculatorButton[i].getFont().deriveFont(20f));
			gridBagConstraints[i] = new GridBagConstraints();
		}

		for (int i = 0; i < BUTTON_SIZE; i++) {
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

		calculatorButton[0].addActionListener(new MyListener());
		
		calculatorButton[1].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				PushButtonLabelPanel.jLabel.setText("0");
				
				RestButtonPanel.count = 0;
				RestButtonPanel.toggleCount = 0;
			}
		});

		calculatorButton[2].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				CalculatorProcessLabelPanel.jLabel.setText(" ");
				PushButtonLabelPanel.jLabel.setText("0");
				
				RestButtonPanel.count = 0;
				RestButtonPanel.toggleCount = 0;
			}
		});

		calculatorButton[3].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int removeLastText = CalculatorProcessLabelPanel.jLabel.getText().length() - 1;

				if (removeLastText == 0) {
					CalculatorProcessLabelPanel.jLabel.setText(" ");
				} else {
					CalculatorProcessLabelPanel.jLabel
							.setText(CalculatorProcessLabelPanel.jLabel.getText().substring(0, removeLastText));

				}
			}
		});

		calculatorButton[4].addActionListener(new MyListener());

	}

}