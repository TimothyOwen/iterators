package iterators;

public class Numbers2 {
	public static String primitives(int num2) {
		String answer = "";
		if(num2==1) {answer="One";}
		if(num2==2) {answer="Two";}
		if(num2==3) {answer="Three";}
		if(num2==4) {answer="Four";}
		if(num2==5) {answer="Five";}
		if(num2==6) {answer="Six";}
		if(num2==7) {answer="Seven";}
		if(num2==8) {answer="Eight";}
		if(num2==9) {answer="Nine";}
		return answer;
	}
	public static String secondHighers(int num2) {
		String answer = "";
		if(num2==10) {answer="Ten";}
		if(num2==20) {answer="Twenty";}
		if(num2==30) {answer="Thirty";}
		if(num2==40) {answer="Fourty";}
		if(num2==50) {answer="Fifty";}
		if(num2==60) {answer="Sixty";}
		if(num2==70) {answer="Seventy";}
		if(num2==80) {answer="Eighty";}
		if(num2==90) {answer="Ninety";}
		return answer;
	}
	public static String thirdHighers(int num2) {
		String answer = "";
		if(num2==100) {answer="One Hundred";}
		if(num2==200) {answer="Two Hundred";}
		if(num2==300) {answer="Three Hundred";}
		if(num2==400) {answer="Four Hundred";}
		if(num2==500) {answer="Five Hundred";}
		if(num2==600) {answer="Six Hundred";}
		if(num2==700) {answer="Seven Hundred";}
		if(num2==800) {answer="Eight Hundred";}
		if(num2==900) {answer="Nine Hundred";}
		return answer;
		
	}
	public static String fourthHighers(int num2) {
		String answer = "error";
		if(num2==1000) {answer="One Thousand";}
		if(num2==2000) {answer="Two Thousand";}
		if(num2==3000) {answer="Three Thousand";}
		if(num2==4000) {answer="Four Thousand";}
		if(num2==5000) {answer="Five Thousand";}
		if(num2==6000) {answer="Six Thousand";}
		if(num2==7000) {answer="Seven Thousand";}
		if(num2==8000) {answer="Eight Thousand";}
		if(num2==9000) {answer="Nine Thousand";}
		return answer;
		
	}
	//
	
	public static String numMethod2(int num2) {
		String answer = "error";
		if (num2<10) {answer = primitives(num2);}
		if(num2>9 && num2<20) {
			if(num2==11) {answer="Eleven";}
			if(num2==12) {answer="Twelve";}
			if(num2==13) {answer="Thirteen";}
			if(num2==14) {answer="Fourteen";}
			if(num2==15) {answer="Fifteen";}
			if(num2==16) {answer="Sixteen";}
			if(num2==17) {answer="Seventeen";}
			if(num2==18) {answer="Eighteen";}
			if(num2==19) {answer="Nineteen";}
		}
		if(num2>20 && num2<100 && num2%10!=0) {
			String i = String.valueOf(num2);
			String k = i.substring(0, 1);
			String j = i.substring(1);
			int m = Integer.parseInt(k);
			int l = Integer.parseInt(j);
			k = secondHighers(num2-l);
			j = primitives(l);
			answer = k + " " + j;
		}
		if(num2>100 && num2<1000) {
			String i = String.valueOf(num2);
			String k = i.substring(0, 1);
			String j = i.substring(1,2);
			String l = i.substring(2,3);
			int m = Integer.parseInt(k);
			int n = Integer.parseInt(j);
			int o = Integer.parseInt(l);
			k = thirdHighers(m*100);
			j = secondHighers(num2-m*100-o);
			l = primitives(o);
			answer = k + " and " + j + " " + l;
		}
		if(num2>1000 && num2%1000!=0) {
			String i = String.valueOf(num2);
			String k = i.substring(0, 1);
			String j = i.substring(1,2);
			String l = i.substring(2,3);
			String m = i.substring(3,4);
			int n = Integer.parseInt(k);
			int o = Integer.parseInt(j);
			int p = Integer.parseInt(l);
			int q = Integer.parseInt(m);
			k = fourthHighers(n*1000);
			j = thirdHighers(num2-n*1000-p*10-q);
			l = secondHighers(num2-n*1000-o*100-q);
			m = primitives(q);
			answer = k + " " + j + " and " + l + " " + m;
		}
		if(num2%10==0 && num2<100) {answer = secondHighers(num2);}
		if(num2%100==0 && num2<1000) {answer = thirdHighers(num2);}
		if(num2%1000==0) {answer = fourthHighers(num2);}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("\n"+numMethod2(1000));
	}
}
