package ch18;

import java.util.ArrayList;

public class PrintTable {

	private String[] title;

	private ArrayList<Person> listPerson;

	private ArrayList<ColumnSize> countSpace;

	public String[] getTitle() {
		return title;
	}

	public void setTitle(String[] title) {
		this.title = title;
	}

	public ArrayList<Person> getList() {
		return listPerson;
	}

	public void setList(ArrayList<Person> list) {
		this.listPerson = list;
	}

	public ArrayList<ColumnSize> getCountSpace() {
		return countSpace;
	}

	public void setCountSpace(ArrayList<ColumnSize> countSpace) {
		this.countSpace = countSpace;
	}

	public void makeLine() {

		ColumnPrint columnPrint = new ColumnPrint();

		countSpace = columnPrint.countSpace(title, listPerson);

	}

	public void header() {

		makeLine();

		ColumnPrint columnPrint = new ColumnPrint(countSpace);
		columnPrint.printColumn(title);

		makeLine();

	}

	public void content() {

		for (int index = 0; index < listPerson.size(); index++) {
			ColumnPrint columnPrint = new ColumnPrint(countSpace);
			columnPrint.setIndex(index);
			String[] temp = columnPrint.tempArray(listPerson);

			columnPrint.printColumn(temp);
		}

		makeLine();

	}

}
