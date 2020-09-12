package ch20_1;

import java.util.ArrayList;

public class dk {

	public static void main(String[] args) {

		String text = "70*2+3";
		
		int i;
		double ans;

		ArrayList<Double> v = new ArrayList<Double>();
		ArrayList<String> op = new ArrayList<String>();

		op.add(null);
		String str = "";

		for (i = 0; i < text.length(); i++) {
			Character c = text.charAt(i);
			String s = Character.toString(c);

			if (Character.isDigit(c)) { // 숫자인지 아닌지 확인하는 메소드
				str += s;
				if (i == text.length() - 1) {
					v.add(Double.parseDouble(str));
				}
			} else if (s.equals(".")) {
				str += s;
			} else {
				v.add(Double.parseDouble(str));
				op.add(Character.toString(c));
				str = "";
			}
		}

		for (i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		for (i = 0; i < op.size(); i++) {
			System.out.println(op.get(i));
		}
		
		for(i = 1; i<v.size();i++) {
			String s = op.get(i);
			double tmp;
			
			if(s.equals("*")) {
				tmp = v.get(i-1) * v.get(i);
				op.remove(i);
				v.remove(i);
				v.remove(i-1);
				v.add(i-1,tmp);
				i--;
			}
		
		}
		
		ans = v.get(0);
		for(i = 1; i<v.size();i++) {
			String s = op.get(i);
			double n = v.get(i);
			
			if(s.equals("+")) {
				ans = ans + n;
			}
		}
		
		System.out.println(ans);

	}

}
