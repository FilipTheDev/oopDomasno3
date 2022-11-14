package Zadaca4;

import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		int brojNaFrlanja;
		
		Brojach brojPismo = new Brojach();
		Brojach brojGlava = new Brojach();
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vnesi broj na frlanja na parichkata: ");
		brojNaFrlanja = scanner.nextInt();
		
		while (brojNaFrlanja > 0) {
			brojPismo.reset();
			brojGlava.reset();
			
			for(int i=0; i<brojNaFrlanja; i++)
			{
				if(Math.random() < 0.5)
					brojPismo.zgolemi();
				else
					brojGlava.zgolemi();
			}
		System.out.println("Vo " + brojNaFrlanja + " frlanja");
		System.out.println("Padnaa: " + brojPismo.brojach + " pisma");
		System.out.println("Padnaa: " + brojGlava.brojach + " glavi");
		
		System.out.println("Dokolku sakate povtorno da ja frlite parickata, vnesete broj na frlanja: ");
		brojNaFrlanja = scanner.nextInt();
		
		}
		scanner.close();
	}
}