package com.nexsoft.logic;

public class Sample1 {

	public static void main(String[] args) {
		
		// + - / * =
		// +=
		// < >
		// && || !
		// & |
		// ? :
		
		// || vs |
		int a = 10; //0000 1010
		int b = 5; //0000 0101
		int c = 20;
		int d = 0;
//		System.out.println(a > b || a < c);
//		System.out.println(a > b | a < c);
		
//		System.out.println(a > b || a++ < c);
//		System.out.println(a);
//		System.out.println(a > b | a++ < c);
//		System.out.println(a);
		
		d = a & b;
		System.out.println(d);
		d = a | b;
		System.out.println(d);
		
		new Sample2().luasSegitiga(3, 4);

	}

}
