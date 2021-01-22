package iterators;

public class StringManipulation {
	private static void method1(String x) {
		System.out.println("Method 1\n");
		int count = 1;
		for (int i = 0; i < x.length(); i++) {
			String y = x.substring(i, i + 1);
			if (y.equals(" ")) {
				count += 1;
			}
		}
		System.out.println("Count : " + count);
	}

	private static void method2(String x) {
		System.out.println("Method 2\n");
		for (int i = 0; i < x.length(); i++) {
			String y = x.substring(i, i + 1);
			System.out.println(y);
		}
	}

	private static void method3(String x) {
		System.out.println("Method 3\n");
		for (int i = 0; i < x.length(); i++) {
			int j = x.length() - i;
			String y = x.substring(j - 1, j);
			System.out.println(y);
		}
	}

	private static void method4(String message, String key) {
		System.out.println("Method 4");
		boolean checker = false;
		try {
			for (int i = 0; i < message.length() - 1; i++) {
				String x = message.substring(i, i + 1);
				String y;
				String z;
				if (x.equals(key.substring(0, 1))) {
					for (int j = 0; j < key.length(); j++) {
						y = message.substring(i + j, i + j + 1);
						z = key.substring(j, j + 1);
						if (y.equals(z)) {
							checker = true;
						}else {
							checker = false;
						}
					}
				}
			}
		} catch (Exception e) {
			checker = false;
		}
		if (checker) {
			System.out.println("\nThe key lies within the message");
		}else {
			System.out.println("\nThe key was not found in it's entirety");
		}

	}

	public static void main(String[] args) {
		// Only use length substring and equals
		method1("aldf jdl gj");
		System.out.println("\n\n\n\n\n");
		method2("aldfjdlgj");
		System.out.println("\n\n\n\n\n");
		method3("aldfjdlgsdfsdfj");
		System.out.println("\n\n\n\n\n");
		method4("agldgjladjjkeyssageadghhad", "had");
	}
}
