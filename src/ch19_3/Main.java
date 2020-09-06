package ch19_3;

public class Main {

	public static void main(String[] args) {
		String[] title = { "이름", "나이" };
		String[][] content = {{"유진", "24"}, {"민희", "33"}, {"수일","27"}, {"호수","17"}};

		Table table = new Table();
		table.setData(title, content);
		table.printTable();

	}

}
