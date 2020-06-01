/*
package Data_Structure;

public class ex5_4 {

	public static void main(String[] args) {
		float[] a = {4,3,5,0};	//다항식 계수.
		float[] b = new float[]{3,1,0,2,1}; 	//다항식 계수.
		Polynomial A = new Polynomial(3,a);		//3,a데이터를 담을 메모리를 생성하고 그 주소값을 가지는 변수 A를 만든다.
		Polynomial B = new Polynomial(4,b);
		OperatePoly optPoly = new OperatePoly();
		Polynomial C = optPoly.addPoly(A,B); 
		
		System.out.printf("A(X) = "); A.printPoly();
		System.out.printf("B(X) = "); B.printPoly();
		System.out.printf("C(X) = "); C.printPoly();
	}
}

class OperatePoly{		//다항식 덧셈하는 객
	private int degree_A=0, degree_B=0, degree_C=0, index_A=0,index_B=0,index_C=0;	//차수.
	private int expo_A, expo_B;	//지수
	private float coef_A,coef_B,coef_C; //계수.
	
	public Polynomial addPoly(Polynomial A, Polynomial B) {		//더하는 메소
		degree_A = A.getDegree();		//A의 차수를 넣어.
		degree_B = B.getDegree();		//B의 차수를 넣어.
		expo_A = degree_A;
		expo_B = degree_B;
		
		if(degree_A>degree_B) degree_C = degree_A;	//만약 A가 더 크면 새로운 C에 A차수를 넣어준다.
		else degree_C = degree_B;
		
		Polynomial C = new Polynomial(degree_C);		//새로운 다항식(객체)을 생성한다.
		while(index_A<=degree_A && index_B<=degree_B) {		//각 최고차항만큼 돌아야한다.
			if(expo_A>expo_B) {
				C.setCoef(index_C++,A.getCoef(index_A++));
				expo_A--;
			}
			else if(expo_A == expo_B) {
				C.setCoef(index_C++, A.getCoef(index_A++)+B.getCoef(index_B++));
				expo_A--; expo_B--;
			}
			else {
				C.setCoef(index_C++,B.getCoef(index_B++));
				expo_B--;
			}
		}
		return C;
	}
}

class Polynomial{	//다항식.
	private int degree;	//차수.
	private float coef[] = new float[20];	//계수.
	
	Polynomial(int degree,float coef[]) {	//차수, 계수 초기화.
		this.degree = degree;
		this.coef = coef;
	}
	Polynomial(int degree){		//차수 초기화.
		this.degree = degree;
		for(int i=0;i<=this.degree;i++)	//계수가 없으니까 0으로 다 초기화해준다.
			this.coef[i]=0;
	}
	
	public int getDegree() {	//차수 결과값.
		return this.degree;
	}
	public float getCoef(int i) {	//계수 몇번째 결과값.
		return this.coef[i];
	}
	public float setCoef(int i, float coef) { 	//계수를 추가하는 것. 몇번째의 계수.
		return this.coef[i] = coef;
	}
	public void printPoly() {		//다항식 출력.
		int temp = this.degree;	//임시공간에 차수를 넣어두기.
		for(int i=0;i<=this.degree;i++) {	//차수+1만큼.
			System.out.printf("%3.0fx^%d",this.coef[i],temp--);	//차수를 점점 줄여나가야하기 때문에.
		}
		System.out.println();
	}
}
*/


