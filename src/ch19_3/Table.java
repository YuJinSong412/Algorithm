package ch19_3;

import java.util.ArrayList;

public class Table {

	// tr을 가지고 있음.
	private ArrayList<TableRow> tableRows;

	public Table() {
		tableRows = new ArrayList<TableRow>();
	}

	public ArrayList<TableRow> getTableRows() {
		return tableRows;
	}

	public void setTableRows(ArrayList<TableRow> tableRows) {
		this.tableRows = tableRows;
	}

	public void setData(String[] title, String[][] content) {

		TableRow tableRow = new TableRow();
		for (int i = 0; i < title.length; i++) {
			TableData tableHeader = new TableData(title[i]);
			tableRow.addTableHeader(tableHeader);
		}
		getTableRows().add(tableRow);
		
		
		for(int i=0;i<content.length;i++) {
			TableRow tableRow1 = new TableRow();
			for(int j=0;j<content[i].length;j++) {
				TableData tableData = new TableData(content[i][j]);
				tableRow1.addTableData(tableData);
			}
			getTableRows().add(tableRow1);
		}
		
		System.out.println(tableRows.size());
		//System.out.println(tableRows.get(0).getTableHeader().get(1).getData());
	}

	public void printTable() {
		
		int rowIndex = 0;

		Print print = new Print();
		print.printprint(tableRows,2);
		print.printprint(tableRows,2);
		
	}

	private void printTableRow(int rowIndex) {
		
		Cell cell = new TableHeader();
		String headerPrint = rowIndex == 0 ? cell.getBorderTop() + "\n" : "";
		
		String newData = "";
		newData = cell.spacedData(tableRows.get(rowIndex).getTableData().get(rowIndex).getData());
		String result = headerPrint + cell.getBorderLeft() + newData + cell.getBorderRight() + "\n" + headerPrint;

		//System.out.println(headerPrint);
		//System.out.println(tableRow.getTableHeader());
		
		System.out.println(result);
		
	}

}
