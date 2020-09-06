package ch19_3;

public class Person {

	private TableHeader name;
	
	private TableHeader age;
	
	public Person(TableHeader name, TableHeader age) {
		this.name = name;
		this.age = age;
	}

	public TableHeader getName() {
		return name;
	}

	public void setName(TableHeader name) {
		this.name = name;
	}

	public TableHeader getAge() {
		return age;
	}

	public void setAge(TableHeader age) {
		this.age = age;
	}
	
	
}
