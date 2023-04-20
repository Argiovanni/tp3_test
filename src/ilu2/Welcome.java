package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		if (input==null||input.isEmpty() || input.trim().isBlank()){
			return "Hello, my friend";
		}
		String[] names = input.split(",");
		String s1 = names[0].substring(0, 1).toUpperCase();
		String s2 = names[0].substring(1);
		
		StringBuilder hello = new StringBuilder();
		hello.append("Hello, ");
		hello.append(s1);
		hello.append(s2);
		if (names.length>1){
			String s3 = names[1].substring(0, 1).toUpperCase();
			String s4 = names[1].substring(1);
			hello.append(", ");
			hello.append(s3);
			hello.append(s4);
		}
		if(input == input.toUpperCase()) {
			hello.append("!");
			return hello.toString().toUpperCase();
		}
		return hello.toString();
	}
}
