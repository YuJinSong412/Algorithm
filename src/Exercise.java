class Yu{
	int data=0;
	
	public int add(int a, int b) {
		data = a+b;
		return data;
	}
}

public class Exercise {

	public static void main(String[] args) {
		Yu yu = new Yu();
		
		System.out.println(yu.add(4, 5));

	}

}
