package com.nexsoft.logic;

import java.util.Random;

public class SampleMath {

	public static void main(String[] args) {
		
		double acak = Math.random();
		
		//System.out.println(acak);
		/*
		int max = 10;
		int min = 1;
		int range = max - min + 1;
		
		for(int i = 0; i < 10; i++) {
			int acakInt = (int)(Math.random()*range) + min;
			System.out.printf("%d \n", acakInt);
		}
		*/
		/*
		double nilai1 = Math.sqrt(9);
		System.out.println(nilai1);
		
		double nilai2 = Math.pow(2, 7);
		System.out.println(nilai2);
		*/
		
		Random acak1 = new Random();
		for(int i = 0; i < 10; i++) {
			int acakAngka = - 50 + acak1.nextInt(100);
			System.out.println(acakAngka);
		}
		

	}

}
