package com.mhawthor.program.random;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GiveAway {
		
	static boolean durum = false;
	static ArrayList<Person> list;
	private static Scanner sc;
	
	public static void main(String[]args){
		
		 list = new ArrayList<Person>();
		sc = new Scanner(System.in);
		
		for (int i = 0; i < Integer.MAX_VALUE; i++){
			System.out.println("Bir isim girin.");
			String s = sc.next();
		
		
		if (!s.equalsIgnoreCase("baþlat")){
			Person p = new Person(s, i);
			
			list.add(p);
			System.out.println("Eklendi.");
			
		}else if (s.equalsIgnoreCase("baþlat")){
			System.out.println("Çekiliþ baþlýyor..");
			uyut(1);
			Random r = new Random();
			System.out.println("Hazýrlanýyor...");
			uyut(1);
			int kazanan = r.nextInt(list.size());
			System.out.println("Çekiliyor....");
			uyut(1);
			Person kazananKisi = list.get(kazanan);
			System.out.println("Kazanan Kiþi :" + kazananKisi.getName());
			JOptionPane.showMessageDialog(null, "Kazanan Kiþi :" + kazananKisi.getName(), "Cekilis 0.1V", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			
		}
		
		
		
		
			
				
		
		
	}
	}
	
	private static void uyut(int i){
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



	
