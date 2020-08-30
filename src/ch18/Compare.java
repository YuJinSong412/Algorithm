package ch18;

import java.util.ArrayList;

public class Compare {
	
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
	
	private ArrayList<Person> listPerson;

	private ArrayList<ColumnSize> countSpace;
	
	public Compare(ArrayList<ColumnSize> countSpace, ArrayList<Person> listPerson) {
		this.countSpace = countSpace;
		this.listPerson = listPerson;
	}

	public ArrayList<ColumnSize> he() {
		for (int i = 0; i < listPerson.size(); i++) {
			int[] compare = new int[listPerson.size()];

			compare[LAST_NAME] = listPerson.get(i).getLast_name().length();
			compare[FIRST_NAME] = listPerson.get(i).getFirst_name().length();
			compare[EMAIL] = listPerson.get(i).getEmail().length();
			compare[PHONE] = listPerson.get(i).getPhone().length();
			compare[ADDRESS] = listPerson.get(i).getAddress().length();
			compare[SECURITY] = listPerson.get(i).getSecurity().length();
			compare[HAMBURDERING] = listPerson.get(i).getHamburgerIng().length();
			compare[WKWKWKDSOAUS] = listPerson.get(i).getWkwkwkdsoaus().length();
			compare[YUJINSONGI] = listPerson.get(i).getYujinsongi().length();
			compare[DKSSUDGKTPDY] = listPerson.get(i).getDkssudgktpdy().length();

			for (int j = 0; j < compare.length; j++) {
				if (countSpace.get(j).getSize() < compare[j]) {
					countSpace.get(j).setSize(compare[j]);
				}
			}

		}
		return countSpace;
	}

}
