package com.nexsoft.decision;

import java.util.Calendar;
import java.util.Scanner;

public class SampleDecision2 {

	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		
		int inputNilai;
		char nilaiHuruf;
		System.out.println("Masukkan nilai = ");
		inputNilai = input.nextInt();
		
		if (inputNilai >= 90 && inputNilai <= 100) 
		{
			nilaiHuruf = 'A';
			System.out.println("Nilai = " + nilaiHuruf);
		}
		else if (inputNilai >= 85 && inputNilai <= 89) {
			nilaiHuruf = 'B';
			System.out.println("Nilai = " + nilaiHuruf);
		}
		else if (inputNilai >= 75 && inputNilai <= 84) {
			nilaiHuruf = 'C';
			System.out.println("Nilai = " + nilaiHuruf);
		}
		else if (inputNilai >= 0 && inputNilai <= 74) {
			nilaiHuruf = 'D';
			System.out.println("Nilai = " + nilaiHuruf);
		}
		else {
			System.out.println("Masukkan nilai 0-100");
		}
		*/
		
		/*
		Calendar time = Calendar.getInstance();
		int hour = time.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		if (hour >= 0 && hour <= 12) {
			System.out.println("Selamat Pagi");
		}
		else if (hour >= 13 && hour <= 16) {
			System.out.println("Selamat Siang");
		}
		else if (hour >= 17 && hour <= 18) {
			System.out.println("Selamat Sore");
		}
		else {
			System.out.println("Selamat Malam");
		}
		*/
		
		/*
		Calendar date = Calendar.getInstance();
		int tanggal = date.get(Calendar.DATE);
		System.out.println("Tanggal = " + tanggal);
		
		System.out.println("Masukkan Nomor Plat = ");
		Scanner input = new Scanner(System.in);
		
		int platNomor;
		platNomor = input.nextInt();
		
		if (tanggal % 2 == platNomor % 2) {
			System.out.println("Tidak Melanggar");
		}
		else if (tanggal % 2 != platNomor % 2) {
			System.out.println("Melanggar");
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		
		int usia, beratBadan;
		System.out.println("Masukkan Usia = ");
		usia = input.nextInt();
		
		System.out.println("Masukkan Berat Badan = ");
		beratBadan = input.nextInt();
		
		if (usia > 17 && usia < 50) {
			if (beratBadan > 55) {
				System.out.println("Boleh donor darah");
			}
			else {
				System.out.println("Maaf berat badan anda kurang");
			}
		}
		else {
			if (beratBadan > 55) {
				System.out.println("Maaf usia anda tidak memenuhi syarat");
			}
			else {
				System.out.println("Maaf berat badan dan usia anda tidak memenuhi syarat");
			}
		}
		*/
		
		Scanner input = new Scanner(System.in);
		
		int malam;
		char kelas, dokter;
		double totalBayar;
		System.out.print("Masukkan durasi menginap = ");
		malam = input.nextInt();
		System.out.println(" ");
		
		System.out.print("Masukkan kelas pilihan = ");
		kelas = input.next().charAt(0);
		System.out.println(" ");
		
		System.out.print("Masukkan dokter pilihan = ");
		dokter = input.next().charAt(0);
		System.out.println(" ");
		
		if (kelas == '1') {
			if (dokter == 'A') {
				totalBayar = 100000*malam + 1000000;
				System.out.println("Total Bayar = Rp " + totalBayar);
			}
			else if (dokter == 'B') {
				totalBayar = 100000*malam + 2000000;
				System.out.println("Total Bayar = Rp " + totalBayar);
			}
		}
		else if (kelas == '2') {
			if (dokter == 'A') {
				totalBayar = 50000*malam + 1000000;
				System.out.println("Total Bayar = Rp " + totalBayar);
			}
			else if (dokter == 'B') {
				totalBayar = 50000*malam + 2000000;
				System.out.println("Total Bayar = Rp " + totalBayar);
			}
		}
		
		
		
	}
}
