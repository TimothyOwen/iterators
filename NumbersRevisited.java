package iterators;

public class NumbersRevisited {
	public static void main(String[] args) {
		String answer = "";
		String j;
		String k;
		String l;
		int n;
		for(int i = 1; i<100; i++) {
			if (i<10) {answer = Numbers2.primitives(i);}
			if(i>9 && i<20) {
				if(i==11) {answer="Eleven";}
				if(i==12) {answer="Twelve";}
				if(i==13) {answer="Thirteen";}
				if(i==14) {answer="Fourteen";}
				if(i==15) {answer="Fifteen";}
				if(i==16) {answer="Sixteen";}
				if(i==17) {answer="Seventeen";}
				if(i==18) {answer="Eighteen";}
				if(i==19) {answer="Nineteen";}
			}
			if(i>20 && i<100 && i%10!=0) {
				j = String.valueOf(i);
				k = j.substring(0, 1);
				l = j.substring(1, 2);
				n = Integer.parseInt(l);
				k = Numbers2.secondHighers(i-n);
				j = Numbers2.primitives(n);
				answer = k + " " + j;
			}
			if(i%10==0) {answer = Numbers2.secondHighers(i);}
			System.out.println(answer);
		}
	}
}
