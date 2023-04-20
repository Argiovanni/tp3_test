package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		if (input==null||input.isEmpty() || input.trim().isBlank()){
			return "Hello, my friend";
		}
		StringBuilder hello = new StringBuilder();
		hello.append("Hello");
		
		String[] names = input.split(",");
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			String s1 = name.substring(0, 1).toUpperCase();
			String s2 = name.substring(1);
			hello.append(", ");
			hello.append(s1);
			hello.append(s2);	
		}
		
		if(input == input.toUpperCase()) {
			hello.append("!");
			return hello.toString().toUpperCase();
		}
		return hello.toString();
	}
}
