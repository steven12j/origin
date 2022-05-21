package com.nexsoft.decision;

import java.util.Scanner;

import com.nexsoft.logic.Sample2;

public class Decision1 {

	public static void main(String[] args) {
		/*
		int num = 3;
		if(num > 2) {
			int x = 10 * num - 2;
			System.out.println("x = " + x);
		}
		
		String kata1 = "Nexsoft";
		String kata2 = "nexsoft";
		if(kata1.equalsIgnoreCase(kata2)) {
			System.out.println("Kata sama");
		}
		else {
			System.out.println("Kata beda");
		}
		
		Integer num1 = 10;
		Integer num2 = 10;
		if(num1.equals(num2)) {
			System.out.println("Angka sama");
		}
		*/
		/*
		//pilih firefox
		//jalankan firefox
		Scanner input = new Scanner(System.in);
		
		String inputBrowser;
		String browser = "Firefox";
		System.out.println("Masukkan nama browser : ");
		inputBrowser = input.next();
		if(inputBrowser.equalsIgnoreCase(browser)) {
			System.out.println("Jalankan browser firefox");
		}
		else {
			System.out.println("Tidak jalankan");
		}
		*/
		
		/*
		int angka = 3;
		System.out.println("Angka = " + angka);
		if(angka % 2 == 0) {
			System.out.println("Bilangan Genap");
		}
		else {
			System.out.println("Bilangan Ganjil");
		}
		*/		
		
		new Sample2().luasSegitiga(3, 4);
		
	}
	
}
