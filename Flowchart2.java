package iterators;

public class Flowchart2 {
	public static void printOut() {
		for(int i=1; i<11; i++) {
			for(int j=1; j<11; j++) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		for(int A=0; A<200; A++) {
			if(A%2 == 0) {
				System.out.println("-");
				System.out.println(A);
				A++;
			}
			else{
				System.out.println(A);
				A++;
			}
		}
		printOut();
	}
}
