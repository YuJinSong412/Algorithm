package ch19_3;

import java.util.ArrayList;

public class Print {
	
	private ArrayList<TableRow> tableRows; 
	
	public void printprint(ArrayList<TableRow> tableRows, int index) {
		this.tableRows = tableRows;
		
		int columnIndex = 0;
		String result = "";
		
		Cell cell = new TableData();
		
		for(int i=0;i<tableRows.size();i++) {
			//Cell cell = new TableData();
			if(columnIndex == 3) {
				break;
			}
			String headerPrint = i == 0 ? cell.getBorderTop()+"\n" : "";
			
			String newData = "";
			newData = cell.spacedData(tableRows.get(i).getTableData().get(0).getData());
			
			result = headerPrint+ cell.getBorderLeft() + newData + cell.getBorderRight() + "\n" + headerPrint;
			
			System.out.print(result);
		}
		System.out.println(cell.getBorderBottom());
	}

}
