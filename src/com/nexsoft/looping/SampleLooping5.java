package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping5 {

	public static void main(String[] args) {
		/*
		int i = 0, sum = 0;
		while (i < 5) {
			i++;
			if (i == 3) continue;
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
		*/
		/*
		for(int i = 0; i < 5; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Close ya/tidak?");
			int jawab = input.nextInt();
			if(jawab == 0 ) {
				break;
			}
		}
		System.out.println("Terima Kasih");
	}

}
