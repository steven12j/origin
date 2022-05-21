package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		int nilaiAwal, nilaiAkhir;
		System.out.print("Masukkan Nilai Awal : ");
		nilaiAwal = input.nextInt();
		System.out.print("Masukkan Nilai Akhir : ");
		nilaiAkhir = input.nextInt();
		
		for(int i = nilaiAwal; i <= nilaiAkhir; i++) {
			System.out.println("Looping ke " + i);
		}
		*/
		/*
		String motor[] = new String[3];
		for(int i = 0; i < motor.length; i++) {
			System.out.println("Masukkan data motor : ");
			motor[i] = input.nextLine();
		}
		
		for(String i : motor) {
			System.out.println(i);
		}
		*/
		// nilai = 70, 80, 75, 90
		/*
		int nilai[] = new int[4];
		for(int i = 0; i < nilai.length; i++) {
			System.out.println("Masukkan data nilai : ");
			nilai[i] = input.nextInt();
		}
		
		int sum = 0;
		for(int i : nilai) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("Jumlah Nilai = " + sum);
		
		int nilai1 = 80, nilai2 = 20;
		System.out.println("Sum = " + Integer.sum(nilai1, nilai2));
		*/
		
		for(int i = 10; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.print(" * ");
			}
			else {
				System.out.print(i);
			}
		}
	}
}
