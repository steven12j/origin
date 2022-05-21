package com.nexsoft.looping;

public class SampleLooping3 {

	public static void main(String[] args) {
		/*
		for(int i = 5; i > 1; i--) {
			for(int j = 1; j < i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		for(int i = 9; i > 1; i--) {
			for(int j = 2; j < i; j++) {
				if (j % 2 == 0) {
					System.out.print(j);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		/*
		for(int i = 2; i < 1; i++)
		 {
			if (i % 2 == 0) {
				for(int j = 9; j > i; j--) {
					System.out.print();
				}
			}
			else {
				System.out.print("*");
			}
				
			System.out.println();
		}
		*/
		
		
		//Tampilkan bilangan yang habis dibagi 3 dan 5
		//Range 20 - 200 
		//Berapa total
		
		int sum = 0;
		for(int i = 20; i <= 200; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

}
