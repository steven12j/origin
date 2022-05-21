package com.nexsoft.logic;

public class Palindrom {

	public static void main(String[] args) {
		
		//new Palindrom().palindrome("katak");
		//new Palindrom().palindromReverse("ibu ratna antar ubi");

	}
	
	public void palindrome(String teks) {
		String poli = "";
		System.out.println(teks.length());
		
		for(int i = teks.length(); i > 0; i--) {
			String huruf = teks.substring(i - 1, i);
			poli += huruf;
			System.out.println("Huruf : " + huruf);
			System.out.println("Poli : " + poli);
		}
		
		if(teks.equals(poli)) {
			System.out.println(teks + " adalah palindrome");
		}
		else {
			System.out.println(teks + " bukan palindrome");
		}
	}
	
	public void palindromReverse(String teks2) {
		StringBuffer balikTeks = new StringBuffer(teks2);
		balikTeks.reverse();
		if(teks2.equals(balikTeks.toString())) {
			System.out.println(teks2 + " adalah palindrom");
		}
		else {
			System.out.println(teks2 + " bukan palindrom");
		}
	}
	
	

}
