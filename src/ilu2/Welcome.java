package ilu2;

import java.util.Objects;

public class Welcome {
	
	public static String welcome(String input) {
		if (input==null||input.isEmpty() || input.trim().isBlank()){
			return "Hello, my friend";
		}
		StringBuilder hello = new StringBuilder("Hello");
		StringBuilder helloUpper = new StringBuilder("HELLO");
		String[] names = input.split(",");
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			if (Objects.equals(name, name.toUpperCase())) {
				helloUpper.append(", ").append(name);
			} else {
				String s1 = name.substring(0, 1).toUpperCase();
				String s2 = name.substring(1);
				hello.append(", ").append(s1).append(s2);
			}
		}
		if(Objects.equals(input, input.toUpperCase())) {
			return helloUpper.append(" !").toString().toUpperCase();
		}
		if (!"HELLO".equals(helloUpper.toString())) {
			StringBuilder link = new StringBuilder(". AND "); 
			hello.append(link.append(helloUpper.append(" !").toString()));
		}
		return hello.toString();
	}
}
