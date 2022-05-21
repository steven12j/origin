package com.nexsoft.day1;

public class Sample2 {

	public static void main(String[] args) {
		int i = 123;
		long j = i;
		
		char huruf = 'W';
		int angka = huruf;
		
		float data = 123.4f;
		double data2 = data;
		
		System.out.println(j);
		System.out.println(angka);
		
		float jarak = 100;
		float waktu = 50;
		
		float kecepatan = jarak/waktu;
		double skala = kecepatan;
		
		int bil = 10;
		double bil2 = bil;
		System.out.println(bil2);
		
		float saldoAkhir = 10000.99f;
		System.out.println(saldoAkhir);
		int saldoAkhirBulat = (int) saldoAkhir;
		System.out.println(saldoAkhirBulat);
		
	}
	
	
}
