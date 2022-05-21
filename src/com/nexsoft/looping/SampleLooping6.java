package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		String password = "nexsoft";
		int hitungSalah = 0;
		
		String inputPassword;
		
		while (true) {
			System.out.println("Masukkan password");
			inputPassword = input.nextLine();
			if (inputPassword.equals(password)) {
				System.out.println("Selamat anda berhasil masuk!");
				break;
			}
			hitungSalah++;
			if (hitungSalah == 3) {
				System.out.println("Anda gagal, silahkan coba nanti");
				break;
			}
		}
		*/
		/*
		int jumlahDeret = 10, angka1 = 0, angka2 = 1;
		System.out.println("Deret Fibonaci");
		for(int i = 1; i <= jumlahDeret; i++) {
			System.out.println(angka1 + " ");
			int angkaSebelumnya = angka1 + angka2;
			angka1 = angka2;
			angka2 = angkaSebelumnya;
		}
		*/
		/*
		int jumlahDeret = 10, hasil = 0;
		
		System.out.println("Masukkan angka : ");
		int inputAngka1 = input.nextInt();
		
		for(int i = 1; i <= jumlahDeret; i++) {
			hasil = inputAngka1 * i;
			System.out.println(inputAngka1 + " x " + i + " = " + hasil);
		}
		*/
		
		for(int i = 1; i <= 21; i += 2){

			System.out.print( i + " ");

		}
	}

}
