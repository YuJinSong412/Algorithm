import java.util.*;

public class ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("## 로그인 (admin 혹은 임의 아이디) ##");
	    System.out.print("로그인 아이디 : ");
	    String name = scanner.next();
	    
	    if(name.equals("admin")) {
	    	System.out.println("관리자 로그인!!");
	    }
	    else {
	    	System.out.println(name + " 로그인!!");
	    }
	    
	    System.out.println("## 메뉴를 선택 하세요(1~2) ##");
		System.out.print("# 메뉴 선택 : ");
		String num = scanner.next();
		
		if(num.equals("1") && name.equals("admin")) {
			System.out.println("관리자 1번 선택함!!");
		}
		else if(num.equals("2") && name.equals("admin")) {
			System.out.println("관리자 2번 선택함!!");
		}
		else if(num.equals("1") && !name.equals("admin")) {
			System.out.println(name + " "+num+"번 선택함!!");
		}
		else if(num.equals("2") && !name.equals("admin")) {
			System.out.println(name + " "+num+"번 선택함!!");
		}
	}

}