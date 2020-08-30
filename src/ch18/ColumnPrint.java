package ch18;

import java.util.ArrayList;

public class ColumnPrint {

	private final int LAST_NAME = 0;
	private final int FIRST_NAME = 1;
	private final int EMAIL = 2;
	private final int PHONE = 3;
	private final int ADDRESS = 4;
	private final int SECURITY = 5;
	private final int HAMBURDERING = 6;
	private final int WKWKWKDSOAUS = 7;
	private final int YUJINSONGI = 8;
	private final int DKSSUDGKTPDY = 9;

	private int index = 0;

	private ArrayList<ColumnSize> countSpace;
	
	private ArrayList<Person> listPerson;
	


	public ColumnPrint() {
		
	};

	public ColumnPrint(ArrayList<ColumnSize> countSpace) {
		this.countSpace = countSpace;
	}

	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public ArrayList<ColumnSize> getCountSpace() {
		return countSpace;
	}

	public void setCountSpace(ArrayList<ColumnSize> countSpace) {
		this.countSpace = countSpace;
	}

	public ArrayList<Person> getListPerson() {
		return listPerson;
	}

	public void setListPerson(ArrayList<Person> listPerson) {
		this.listPerson = listPerson;
	}


	
	public ArrayList<ColumnSize> initCountSpace(String[] title) {

		countSpace = new ArrayList<ColumnSize>();

		int index = 0;
		for (String t : title) {
			ColumnSize columnSize = new ColumnSize(index++, t.length());
			countSpace.add(columnSize);
		}

		return countSpace;

	}

	public ArrayList<ColumnSize> countSpace(String[] title, ArrayList<Person> listPerson) {
		initCountSpace(title);

		for (index = 0; index < listPerson.size(); index++) {

			String[] compare = tempArray(listPerson);
			for (int j = 0; j < compare.length; j++) {
				if (countSpace.get(j).getSize() < compare[j].length()) {
					countSpace.get(j).setSize(compare[j].length());
				}
			}

		}
		
		for (int k = 0; k < countSpace.size(); k++) {
			System.out.print("+");
			for (int l = 0; l < countSpace.get(k).getSize(); l++) {

				System.out.print("-");

			}
		}
		System.out.print("+");
		System.out.println();

		return countSpace;
	}

	public void printColumn(String[] temp) {

		for (int i = 0; i < temp.length; i++) {
			System.out.print("|");
			if (countSpace.get(i).getSize() > temp[i].length()) {
				
				System.out.printf("%-"+countSpace.get(i).getSize()+"s", temp[i]);
				
			} else {
				System.out.print(temp[i]);
			}
		}
		System.out.print("|");
		System.out.println();
	}

	public String[] tempArray(ArrayList<Person> listPerson) {

		String[] temp = new String[listPerson.size()];

		temp[LAST_NAME] = listPerson.get(index).getLast_name();
		temp[FIRST_NAME] = listPerson.get(index).getFirst_name();
		temp[EMAIL] = listPerson.get(index).getEmail();
		temp[PHONE] = listPerson.get(index).getPhone();
		temp[ADDRESS] = listPerson.get(index).getAddress();
		temp[SECURITY] = listPerson.get(index).getSecurity();
		temp[HAMBURDERING] = listPerson.get(index).getHamburgerIng();
		temp[WKWKWKDSOAUS] = listPerson.get(index).getWkwkwkdsoaus();
		temp[YUJINSONGI] = listPerson.get(index).getYujinsongi();
		temp[DKSSUDGKTPDY] = listPerson.get(index).getDkssudgktpdy();

		return temp;

	}

}
