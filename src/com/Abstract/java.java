package com.Abstract;

import java.util.LinkedHashMap;
import java.util.Map;

public class java {

	private static void repetativeWord() {

		String s = "My Name Is Billa";

		for (int i = s.length() - 1; i >= 0; i--) {

			char charAt = s.charAt(i);
			System.out.print(charAt);

		}
		System.out.println();

		String[] sp = s.split(" ");

		for (int j = sp.length - 1; j >= 0; j--) {

			System.out.print(sp[j] + "");

		}
		System.out.println();

		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

		char[] ch = s.toCharArray();

		for (char c : ch) {

			if (m.containsKey(c)) {

				m.put(c, m.get(c) + 1);

			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
	}

	private static void javaNormal() {

//		int a = 7;
//		int mul = 1;
//
//		for (int i = 1; i <= a; i++) {
//
//			mul = mul * i;
//			
//			System.out.println(mul);
//		}
//		
//		System.out.println();
//
//	}
//	
//	//fibonacci
//	{
//		int a = 0;
//		int b = 1;
//
//		for (int i = 1; i <= 8; i++) {
//
//			int c = a + b;
//
//			System.out.print(c + " ");
//			a = b;
//			b = c;
//		}
		
		int m = 8;
		for (int i = 1; i <= m; i++) {
			
			int sum = i * m;
			
			System.out.println(m +" * "+ i +" = "+sum);
			
		}
	}

	public static void main(String[] args) {

		javaNormal();

	}

}
