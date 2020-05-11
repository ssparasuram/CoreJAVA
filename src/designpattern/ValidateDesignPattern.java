package designpattern;

public class ValidateDesignPattern {

	public static void main(String[] args) {
		// 1. SingleTon
		// create two new class instance check the values

		Singleton s1 = Singleton.getInstance("Laptop");

		System.out.println(s1.name);

		Singleton s2 = Singleton.getInstance("Book");
		String[] names = { "test", "new" };
		StringBuilder sb = new StringBuilder();
		System.out.println(whoLikesIt("anuj"));

		System.out.println(s2.name);

	}

	public static String whoLikesIt(String... names) {
		if (names.length < 1) {
			return "no one likes this";
		}

		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < names.length) {

			if (i == 0) {
				sb.append(names[i]);
				if (names.length > 2) {
					sb.append(", ");
				} 
			} else {
				if (i > 2 && names.length > 3) {
					String st = "and " + String.valueOf(names.length - 2) + " others";
					sb.append(st);
				} else if (i == names.length - 1) {
					sb.append("and ");
					sb.append(names[i]);
				} else {
					sb.append(names[i]+" ");
				}
			}

			i++;

		}
		if (names.length > 1) {
			sb.append(" like this");
		} else {
			sb.append(" likes this");
		}

		return sb.toString();
	}

}
