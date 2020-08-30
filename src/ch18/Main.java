package ch18;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String[] title = { "last_name", "first_name", "email", "phone", "address", "security", "hamburgerIng",
				"wkwkwkdsoaus", "yujinsongi", "dkssudgktpdy" };

		String[][] content = {
				{ "yujin", "song", "songij4@gmail.com", "01050271921", "970412-2069612", "qjrjzld", "dkahfffkd",
						"wkwmdskdldyd", "dhkdndkhdkn", "dkdldldldl" },
				{ "yuj", "so", "song4@gmail.com", "01050271921", "92069612", "qjrjzld", "dkahfffkd", "wkwmdskdldyd",
						"dhkdnddkn", "dkdldlssdldl" },
				{ "yuin", "sosdadng", "songasdsaij4@gmail.com", "01050271921", "9769612", "qjrjzld", "dkahfffkd",
						"wkwmdsldyd", "ddndkhdkn", "dkdldssdldldl" },
				{ "in", "sg", "songij4@gmail.com", "010adsa50271921", "97049612", "qjrjzld", "dkahfffkd",
						"wkwmdskdldyd", "dhndkhdkn", "dkdldldldsl" },
				{ "yuxzxjindsfsdfe", "sdong", "songij4@gmail.com", "01050271921", "9704f612", "qjrjzld", "dkahfffkd",
						"wkwmdskdldyd", "ddndkhdkn", "dkdsldldldl" },
				{ "yujcvin", "ng", "songij4@gmail.com", "00271921", "970419612", "qjrjzld", "dkahfffkd", "wkwmddldyd",
						"dhkdkhdkn", "dkldldl" },
				{ "yn", "song", "songij4@gmail.com", "01051921", "97041dsf12", "qjrjzld", "dkahfffkd", "wkwmkdldyd",
						"dhkdkhdkn", "dkdldldl" },
				{ "yjin", "sondg", "songij4@gmail.com", "010921", "9704df1212", "qld", "dkahfffkd", "wkwmddldyd",
						"dhkdnddkn", "dkddl" },
				{ "yin", "sonfdg", "songij4@gmail.com", "01050921", "970412", "qjrjzld", "dkahfffkd", "wkdskdldyd",
						"dhkdndhdkn", "dkdldldl" },
				{ "yuds", "ssdong", "songij4@gmail.com", "0101921", "970412sdds12", "qjzld", "fffkd", "wkldyd", "dhkn",
						"dkdl" } };
		ArrayList<Person> listPerson = new ArrayList<Person>();
		
		mergePerson mergePerson = new mergePerson();
		listPerson = mergePerson.merge(content);
		

//		ColumnSize columnSize = new ColumnSize();
//		columnSize.printTitle(title, listPerson);
//		
		PrintTable printTable = new PrintTable();
		printTable.setTitle(title);
		printTable.setList(listPerson);
	
		printTable.header();
		printTable.content();


	}
}
