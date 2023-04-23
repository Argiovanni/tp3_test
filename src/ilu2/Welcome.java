package ilu2;

import java.util.ArrayList;
import java.util.Objects;

public class Welcome {
	
	public static String welcome(String input) {
		if (input==null||input.isEmpty() || input.trim().isBlank()){
			return "Hello, my friend";
		}
		String[][] names = splitLower_Upper(input.split(","));
		StringBuilder msg = new StringBuilder();
		String helloLower = getHello(names[0]);
		String helloUpper = getHello(names[1]);
		if(Objects.equals(input, input.toUpperCase())) {
			return msg.append(helloUpper).append(" !").toString().toUpperCase();
		}
		msg.append(helloLower);
		if (names[1].length >0) {
			StringBuilder link = new StringBuilder(". AND "); 
			msg.append(link.append(helloUpper.toUpperCase()).append(" !").toString());
		}
		return msg.toString();
	}
	
	private static  String[][] splitLower_Upper(String[] names) {
		ArrayList<String> upperNames = new ArrayList<String>();
		ArrayList<String> lowerNames = new ArrayList<String>();
		for (String name : names) {
			if (Objects.equals(name, name.toUpperCase())) {
				upperNames.add(name.trim());
			} else {
				lowerNames.add(name.trim());
		}}
		int nbUpper = upperNames.size();
		int nbLower = lowerNames.size();
		String[] upper = new String[nbUpper];
		String[] lower = new String[nbLower];
		for (int i = 0; i < upper.length; i++) {
			upper[i]=upperNames.get(i);
		}
		for (int i = 0; i < lower.length; i++) {
			lower[i]=lowerNames.get(i);
		}
		String[][] split_names = {lower,upper};
		return split_names;
	}
	
	private static String  getHello(String[] names) {
		StringBuilder hello = new StringBuilder("Hello");
		for (int i = 0; i < names.length-1; i++) {
			String name = names[i];
			String s1 = name.substring(0, 1).toUpperCase();
			String s2 = name.substring(1);
			hello.append(", ").append(s1).append(s2);
		}
		if (names.length > 1) {
			hello.append(" and ");
			String s1 = names[names.length-1].substring(0, 1).toUpperCase();
			String s2 = names[names.length-1].substring(1);
			hello.append(s1).append(s2);
		} else if (names.length == 1) {
			String s1 = names[0].substring(0, 1).toUpperCase();
			String s2 = names[0].substring(1);
			hello.append(", ").append(s1).append(s2);
		}
		return hello.toString();
	}
}
