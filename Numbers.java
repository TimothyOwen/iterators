package iterators;

public class Numbers {
	public static int numMethod1(int num1) {
		String i = String.valueOf(num1);
		String k = i.substring(0, 1);
		String j = i.substring(1);
		int l = Integer.parseInt(j);
		int m = Integer.parseInt(k);
		return l + m;
	}
	
	public static void main(String[] args) {
		System.out.println(numMethod1(99));
	}
}
