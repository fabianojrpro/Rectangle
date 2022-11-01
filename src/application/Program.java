package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle ret = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.println("AREA: " + ret.Area());
		System.out.println("PERIMETER: " + ret.Perimeter());
		System.out.println("DIAGONAL: " + ret.Diagonal());

		
		sc.close();
	}

}
