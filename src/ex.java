import java.util.*;

public class ex {

	public static void main(String[] args) {
		int pwd = 123456;
		int encPwd, decPwd;
		int key  = 0x1A253B65;
		
		System.out.println("암호화 전 비밀번호 : "+pwd);
		
		encPwd = pwd ^ key;  //암호화 값
		
		System.out.println("암호화 후 비밀번호 : "+encPwd);
		
		decPwd = encPwd ^ key;  //암호화를 푼 것
		
		System.out.println("복호화 후 비밀번호 :"+decPwd);
	}

}
