package piramide;

import java.util.Scanner;

public class piramide {

	public static void main(String[] args) {
		System.out.println("introducir el tama�o de la piramide");
		Scanner escan = new Scanner(System.in);
	int tp=escan.nextInt();
	for(int i=1;i<=tp;i++){
		for(int j=0;j<i;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	
	}

}
