package com.nexsoft.looping;

public class SampleLooping {

	public static void main(String[] args) {
		/*
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + ". Nexsoft");
		}
		*/
		/*
		for(int i = 1; i <= 10; i+=2) {
			System.out.print(i + " ");
		}
		*/
		/*
		int i = 1;
		int j = ++i;
		System.out.println(i);
		System.out.println(j);
		
		i = 1;
		j = i++;
		System.out.println(i);
		System.out.println(j);
		*/
		/*
		int j;
		for(int i = 1; i <= 5; i++) {
			System.out.println(j=i++);
		}
		System.out.println("Hasil kedua");
		for(int i = 1; i <= 5; i++) {
			System.out.println(j=++i);
		}
		*/
		
		String motor[] = {"Suzuki","Honda","Yamaha"};
		System.out.println(motor[0]);
		for(String i : motor) {
			System.out.println(i);
		}
	}

}
