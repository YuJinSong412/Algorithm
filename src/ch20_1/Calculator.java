package ch20_1;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Calculator extends JFrame {

	public Calculator() {

		setTitle("계산기");
		CalculatorPanel calculatorPanel = new CalculatorPanel();
		getContentPane().add(BorderLayout.CENTER, calculatorPanel);

		HistoryPanel historyPanel = new HistoryPanel();
		getContentPane().add(BorderLayout.EAST, historyPanel);

		setSize(800, 600);
		setVisible(true);
	}

}
