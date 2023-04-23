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
			return msg.append(helloUpper.toUpperCase()).append(" !").toString();
		}
		msg.append(helloLower);
		if (names[1].length >0) {
			StringBuilder link = new StringBuilder(". AND "); 
			msg.append(link.append(helloUpper.toUpperCase()).append(" !").toString());
		}
		return msg.toString();
	}
	
	private static String firstLetterToUpper(String string) {
		StringBuilder strB = new StringBuilder();
		String s1 = string.substring(0, 1).toUpperCase();
		String s2 = string.substring(1);
		strB.append(s1).append(s2);
		return strB.toString();
	}
	
	private static  String[][] splitLower_Upper(String[] names) {
		ArrayList<String> upperNames = new ArrayList<>();
		ArrayList<String> lowerNames = new ArrayList<>();
		for (String name : names) {
			if (Objects.equals(name, name.toUpperCase())) {
				upperNames.add(name.trim());
			} else {
				lowerNames.add(name.trim());
		}	}
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
	
	private static String[] countNames(String[] names) {
		ArrayList<String> distinct = new ArrayList<>();
		for (int i = 0; i < names.length; i++) {
			if (! distinct.contains(names[i])) {
				distinct.add(names[i]);
		}	}
		int[] count = new int[distinct.size()];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
			for (int j = 0; j < names.length; j++) {
				if (Objects.equals(distinct.get(i), names[j])) {
					count[i]++;
		}	}	}
		String[] countedNames = new String[distinct.size()];
		for (int i = 0; i < countedNames.length; i++) {
			StringBuilder name = new StringBuilder(distinct.get(i));
			if (count[i]>1) {
				name.append(" (*").append(count[i]).append(")");
			}
			countedNames[i]=name.toString();
		}
		return countedNames;
	}
	
	private static String getHello(String[] names) {
		for (int i = 0; i < names.length; i++) {
			if ("yoda".equalsIgnoreCase(names[i])) {
				return getHello_yoda(countNames(names));
		}	}
		return getHello_normal(countNames(names));
	}
	
	private static String  getHello_normal(String[] names) {
		StringBuilder hello = new StringBuilder("Hello");
		for (int i = 0; i < names.length-1; i++) {
			hello.append(", ").append(firstLetterToUpper(names[i]));
		}
		if (names.length > 1) {
			hello.append(" and ").append(firstLetterToUpper(names[names.length-1]));
		} else if (names.length == 1) {
			hello.append(", ").append(firstLetterToUpper(names[0]));
		}
		return hello.toString();
	}
	
	private static String getHello_yoda(String[] names) {
		StringBuilder hello = new StringBuilder(firstLetterToUpper(names[0]));
		for (int i = 1; i < names.length-1; i++) {
			hello.append(", ").append(firstLetterToUpper(names[i]));
		}
		if (names.length > 1) {
			hello.append(" and ").append(firstLetterToUpper(names[names.length-1]));
		} 
		return hello.append(", Hello").toString();
	}
}
