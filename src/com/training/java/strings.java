package com.training.java;

public class strings {

	public static void main(String[] args) {
		String st1 = "this is java programming";
		String st2 = "this my project";
		int length = st1.length();
		boolean text =st1.contains("java");
		boolean ans = st1.equals(st2);
		String[] result = st2.split(" ,");
		System.out.println("result = ");
		for (String str : result) {
			System.out.println(str +", ");
		
		
        System.out.println(st1.length());
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		System.out.println(st1.charAt(2));
		System.out.println(st1.trim());
		System.out.println(st1.replace('t', 'h'));
		System.out.println(st1.substring(0, 4));
		System.out.println(st1.contains("java"));
		System.out.println(ans);
		System.out.println(st1.concat(st2));
		System.out.println(st1.startsWith("this"));
		System.out.println(st1.isEmpty());

	}

}
}
