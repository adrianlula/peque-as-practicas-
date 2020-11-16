package piramide;

import java.util.Scanner;

public class calculador {
	public static void main(String[] args) {
		for(;;){
			System.out.println("que operacion desea realizar?");
			System.out.println("1 suma");
			System.out.println("2  resta");
			System.out.println("3  multiplicasion");
			System.out.println("4  divicion");
			System.out.println("5 potencia");
			System.out.println("6 porcentaje");
			int n1,n2;
			double n3;
 		
			Scanner escan = new Scanner(System.in);
			int menu=escan.nextInt();
			switch(menu){
	        case 1:
	        	 n1=escan.nextInt();
	        	 n2=escan.nextInt();
	        	System.out.println("el resultado de la suma es; "+(n1+n2));
	        	 break;
	        case 2:
	        	 n1=escan.nextInt();
	        	 n2=escan.nextInt();
	        	System.out.println("el resultado de la resta es; "+(n1-n2));
	        	 break;
	        case 3:
	        	 n1=escan.nextInt();
	        	 n2=escan.nextInt();
	        	System.out.println("el resultado de la sultiplicasion es; "+(n1*n2));
	        	 break;
	        case 4:
	        	 n1=escan.nextInt();
	        	 n2=escan.nextInt();
	        	System.out.println("el resultado de la divicion es; "+(n1/n2));
	        	 break;
	        case 5:
	        	 n1=escan.nextInt();
	        	 n2=escan.nextInt();
	        	 n3=Math.pow(n1, n2);
	        	System.out.println("el resultado de la potencia es; "+n3);
	        	 break;
	        case 6:
	        	 n1=escan.nextInt();
	        	 n2=escan.nextInt();
	        	n3=100*(n1/n2);
	        	System.out.println("el resultado de la porcentaje es; "+n3);
	        	 break;
	        case 7:
	        	
	        	 break;
		}
		
		
	}
}
}