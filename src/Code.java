import java.util.*;

class Solution {
    public void solution(int[] answers) {
        int ansSize = answers.length;		
		int[] person1 = {1,2,3,4,5};
		int[] person2 = {2,1,2,3,2,4,2,5};
		int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
		class Person{
			int who;
			int index=0;
			int sum=0;
			Person(int _who){
				who = _who;
			}
		}
		
		Person[] people = new Person[3];
		for(int i =0; i < 3;i++) {
			people[i] = new Person(i+1);
		}
		

		for(int i =0; i < ansSize;i++) {
			if(person1[people[0].index] == answers[i]) {
				people[0].sum++;
			}
			
			if(person2[people[1].index] == answers[i]) {
				people[1].sum++;
			}
			
			if(person3[people[2].index] == answers[i]) {
				people[2].sum++;
			}

			people[0].index++;
			people[1].index++;
			people[2].index++;
			
			people[0].index %= person1.length;
			people[1].index %= person2.length;
			people[2].index %= person3.length;
			
		}
		
		int maxN = -1,cnt = 0;
		for(int i =0; i< people.length;i++) {
			if(maxN < people[i].sum) {
				maxN = people[i].sum;
			}

		}
		
		for(int i =0; i < people.length;i++) {
			if(maxN == people[i].sum){
				cnt++;
			}
		}
		
		int [] answer = new int[cnt];
		int idx = 0;
		for(int i =0; i < people.length;i++) {
			if(maxN == people[i].sum) {
				answer[idx] = people[i].who;
				idx++;
			}
		}
			
		for(int i =0; i < answer.length;i++) {
			System.out.print(answer[i]);
		}
		System.out.println();

    }
    
}
public class Code {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Solution s = new Solution();
		
		int [] sol1 = {1,2,3,4,5};
		int [] sol2 = {1,3,2,4,2};
		
		s.solution(sol1);
		s.solution(sol2);
	}

}
