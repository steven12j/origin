package com.nexsoft.logic;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		
		//Laki-laki Penghasilan 7jt Belum Menikah, maka pajak 10%
		//Laki-laki Penghasilan 7jt Menikah, maka pajak 5%
		//Penghasilan dibawah 7 jt Tidak wajib pajak
		//Perempuan Minimal Penghasilan 7jt Belum Menikah, maka pajak 7%
		//Perempuan Minimal Penghasilan 7jt Menikah, maka pajak 4%
		//Penghasilan dibawah 7jt Tidak wajib pajak
		//Laki-laki = 1, Perempuan = 0;
		
		Scanner input = new Scanner(System.in);
		/*
		int gender, status;
		double penghasilan;
		
		System.out.println("Masukkan penghasilan anda : ");
		penghasilan = input.nextDouble();
		
		if (penghasilan >= 7000000) {
			
			System.out.println("Masukkan gender anda, ketik 0 untuk perempuan, ketik 1 untuk laki-laki : ");
			gender = input.nextInt();
			System.out.println("Masukkan status pernikahan anda, ketik 0 untuk Belum Menikah, ketik 1 untuk Menikah : ");
			status = input.nextInt();
			
			if (gender == 0) {
				if (status == 0) {
					System.out.println("Pajak anda 7%");
				}
				else if (status == 1) {
					System.out.println("Pajak anda 4%");
				}
				else {
					System.out.println("Silahkan masukkan 0 atau 1");
				}
			}
			else if (gender == 1) {
				if (status == 0) {
					System.out.println("Pajak anda 10%");
				}
				else if (status == 1) {
					System.out.println("Pajak anda 5%");
				}
				else {
					System.out.println("Silahkan masukkan 0 atau 1");
				}
			}
		}
		else if (penghasilan < 7000000) {
			System.out.println("Anda tidak wajib pajak");
		}
		else {
			System.out.println("Silahkan masukkan penghasilan");
		}
		*/
		
		new Sample2().luasSegitiga(2, 4);
		
		
	}
	
	public static void luasSegitiga(int alas, int tinggi) {
		double luas = 0.5*alas*tinggi;
		System.out.println(luas);
	}
	
}
