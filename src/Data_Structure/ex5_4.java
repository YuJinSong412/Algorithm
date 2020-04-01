package Data_Structure;

public class ex5_4 {

	public static void main(String[] args) {
		float[] a = {4,3,5,0};
		float[] b = new float[]{3,1,0,2,1};
		Polynomial A = new Polynomial(3,a);
		Polynomial B = new Polynomial(4,b);
		OperatePoly optPoly = new OperatePoly();
		Polynomial C = optPoly.addPoly(A,B); 
		
		System.out.printf("A(X) = "); A.printPoly();
		System.out.printf("B(X) = "); B.printPoly();
		System.out.printf("C(X) = "); C.printPoly();
	}
}

class OperatePoly{
	private int degree_A=0, degree_B=0, degree_C=0, index_A=0,index_B=0,index_C=0;	//차수.
	private int expo_A, expo_B;	//지수
	private float coef_A,coef_B,coef_C; //계수.
	
	public Polynomial addPoly(Polynomial A, Polynomial B) {
		degree_A = A.getDegree();
		degree_B = B.getDegree();
		expo_A = degree_A;
		expo_B = degree_B;
		
		if(degree_A>degree_B) degree_C = degree_A;
		else degree_C = degree_B;
		
		Polynomial C = new Polynomial(degree_C);
		while(index_A<=degree_A && index_B<=degree_B) {
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

class Polynomial{
	private int degree;
	private float coef[] = new float[20];
	
	Polynomial(int degree,float coef[]) {
		this.degree = degree;
		this.coef = coef;
	}
	Polynomial(int degree){
		this.degree = degree;
		for(int i=0;i<=this.degree;i++)
			this.coef[i]=0;
	}
	
	public int getDegree() {
		return this.degree;
	}
	public float getCoef(int i) {
		return this.coef[i];
	}
	public float setCoef(int i, float coef) {
		return this.coef[i] = coef;
	}
	public void printPoly() {
		int temp = this.degree;
		for(int i=0;i<=this.degree;i++) {
			System.out.printf("%3.0fx^%d",this.coef[i],temp--);
		}
		System.out.println();
	}
}


