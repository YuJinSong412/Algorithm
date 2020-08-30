package ch18;

import java.util.ArrayList;

public class mergePerson {
	
	private ArrayList<Person> personList = new ArrayList<Person>();


	public ArrayList<Person> getPersonList() {
		return personList;
	}



	public void setPersonList(ArrayList<Person> personList) {
		this.personList = personList;
	}



	public ArrayList<Person> merge(String[][] content) {
		for(String[] cont : content) {
			Person person = new Person(cont[0],cont[1],cont[2],cont[3],cont[4],cont[5],cont[6],cont[7],cont[8],cont[9]);
			
			personList.add(person);
		}
		
		return personList;
		
	}
	
	

}
