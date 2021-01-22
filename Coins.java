package iterators;

public class Coins {
	public static void change(double num) {
		System.out.println("Amount Payed: "+num+"\n");
		System.out.println("Change Given:\n");
		String answer = "";
		double[] units = {20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
		String[] denominations = {" - £20 Note\n"," - £10 Note\n"," - £5 Note\n"," - £2 Coin\n"," -  £1 Coin\n"," - 50p Coin\n"," - 20p Coin\n"," - 10p Coin\n"," - 5p Coin\n"," - 2p Coin\n"," - 1p Coin\n"};
		double times = 0;
		double divisor;
		for(int i=0; i<11; i++) {
			divisor = units[i];
			if(Math.floor(num/divisor)>=1) {
				times = Math.floor(num/divisor);
				answer += String.valueOf(times) + denominations[i];
				num -= times*divisor;
			}
			System.out.println(num);
		}
		System.out.println(answer);
	}
	public static void main(String[] args) {
		change(0.08);
	}
}
