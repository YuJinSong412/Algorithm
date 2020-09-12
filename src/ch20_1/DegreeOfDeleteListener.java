package ch20_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DegreeOfDeleteListener implements ActionListener{

	private boolean isAll;
	
	public DegreeOfDeleteListener(boolean isAll) {
		this.isAll = isAll;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(isAll) {
			CalculatorProcessLabelPanel.jLabel.setText(" ");
		}
		
		PushButtonLabelPanel.jLabel.setText("0");

		RestButtonPanel.count = 0;
		RestButtonPanel.toggleCount = 0;
	}

}
