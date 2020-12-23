package Baekjoon;

import java.util.Scanner;

public class _1330 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    
    String result = cal(num1, num2);
    System.out.println(result);
  }
  
  public static String cal(int num1, int num2) {
    if(num1 > num2) {
      return ">";
    }else if(num1 < num2) {
      return "<";
    }
    return "==";
  }

}
