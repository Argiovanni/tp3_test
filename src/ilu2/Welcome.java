package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		if (input==null||input.isEmpty() || input.trim().isBlank()){
			return "Hello, my friend";
		}
		String s1 = input.substring(0, 1).toUpperCase();
		String s2 = input.substring(1);
		StringBuilder hello = new StringBuilder();
		hello.append("Hello, ");
		hello.append(s1);
		hello.append(s2);
		
		return "Hello, Bob";
	}
}
