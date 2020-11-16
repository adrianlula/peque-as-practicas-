package timbireicheentrega;

public class timbiriche {
	public static void main(String[] args) {
		
		

		int[] inicio ={1,1,1,1,1,1,1,1,1,1,1,0};
imprimirestado(inicio);
int [] tiro=buscarsolucion(inicio);
System.out.println("   ");
System.out.println("   ");
System.out.println("   ");
imprimirestado(tiro);
	}

	private static void imprimirestado(int[] inicio) {
		System.out.print(".");
		for(int i=0;i<2;i++){
		if(inicio[i]==1){
			System.out.print(" _ ");
	 }else System.out.print("   ");
		System.out.print(".");
		}
		System.out.println("   ");
		for(int i=2;i<5;i++){
			if(inicio[i]==1){
				System.out.print(" 1 ");
			}else System.out.print("   ");	
		}System.out.println("   ");
		for(int i=5;i<7;i++){
			System.out.print(".");
			if(inicio[i]==1){
				System.out.print(" _ ");
			}else System.out.print("   ");
		}System.out.print(".");
		System.out.println("   ");
		for(int i=7;i<10;i++){
			if(inicio[i]==1){
				System.out.print(" 1 ");
			}else System.out.print("   ");
		}System.out.println("   ");
		for(int i=10;i<12;i++){
			System.out.print(".");
			if(inicio[i]==1){
				System.out.print(" _ ");
			}else System.out.print("   ");
		}System.out.print(".");
		System.out.println("   ");
		
	}

	private static int[] buscarsolucion(int[] inicio) {
		int contador1=0,contador2=0,contador3=0,contador4=0;
		if(inicio[0]==1){
			contador1++;
		}
		if(inicio[1]==1){
			contador2++;
		}
		if(inicio[2]==1){
			contador1++;
		}
		if(inicio[3]==1){
			contador1++;
			contador2++;
		}
		if(inicio[4]==1){
			contador2++;
		}
		if(inicio[5]==1){
			contador1++;
			contador3++;
		}
		if(inicio[6]==1){
			contador2++;
			contador4++;
		}
		if(inicio[7]==1){
				contador3++;
			}
		if(inicio[8]==1){
				contador3++;
				contador4++;
			}
		if(inicio[9]==1){
			contador4++;
		}
		if(inicio[10]==1){
			contador3++;
		}
		if(inicio[11]==1){
			contador4++;
		}
if(contador1==3){
	if(inicio[0]!=1){
		inicio[0]=1;
		return inicio;
	}
	if(inicio[2]!=1){
		inicio[2]=1;
		return inicio;
	}
	if(inicio[3]!=1){
		inicio[3]=1;
		return inicio;
	}
	if(inicio[5]!=1){
		inicio[5]=1;
		return inicio;
	}
}
if(contador2==3){
	if(inicio[1]!=1){
		inicio[1]=1;
		return inicio;
	}
	if(inicio[3]!=1){
		inicio[3]=1;
		return inicio;
	}
	if(inicio[4]!=1){
		inicio[4]=1;
		return inicio;
	}
	if(inicio[6]!=1){
		inicio[6]=1;
		return inicio;
	}
}	
if(contador3==3){
	if(inicio[5]!=1){
		inicio[5]=1;
		return inicio;
	}
	if(inicio[7]!=1){
		inicio[7]=1;
		return inicio;
	}
	if(inicio[8]!=1){
		inicio[8]=1;
		return inicio;
	}
	if(inicio[10]!=1){
		inicio[10]=1;
		return inicio;
	}
}
if(contador4==3){
	if(inicio[6]!=1){
		inicio[6]=1;
		return inicio;
	}
	if(inicio[8]!=1){
		inicio[8]=1;
		return inicio;
	}
	if(inicio[9]!=1){
		inicio[9]=1;
		return inicio;
	}
	if(inicio[11]!=1){
		inicio[11]=1;
		return inicio;
	}
}
if(contador1!=2){
	if(inicio[0]!=1){
		inicio[0]=1;
		return inicio;
	}
	if(inicio[2]!=1){
		inicio[2]=1;
		return inicio;
	}
	if(inicio[3]!=1){
		inicio[3]=1;
		return inicio;
	}
	if(inicio[5]!=1){
		inicio[5]=1;
		return inicio;
	}
}
if(contador2!=2){
	if(inicio[1]!=1){
		inicio[1]=1;
		return inicio;
	}
	if(inicio[3]!=1){
		inicio[3]=1;
		return inicio;
	}
	if(inicio[4]!=1){
		inicio[4]=1;
		return inicio;
	}
	if(inicio[6]!=1){
		inicio[6]=1;
		return inicio;
	}
}	
if(contador3!=2){
	if(inicio[5]!=1){
		inicio[5]=1;
		return inicio;
	}
	if(inicio[7]!=1){
		inicio[7]=1;
		return inicio;
	}
	if(inicio[8]!=1){
		inicio[8]=1;
		return inicio;
	}
	if(inicio[10]!=1){
		inicio[10]=1;
		return inicio;
	}
}
if(contador4!=2){
	if(inicio[6]!=1){
		inicio[6]=1;
		return inicio;
	}
	if(inicio[8]!=1){
		inicio[8]=1;
		return inicio;
	}
	if(inicio[9]!=1){
		inicio[9]=1;
		return inicio;
	}
	if(inicio[11]!=1){
		inicio[11]=1;
		return inicio;
	}
}
if(contador1==2&&contador2==2&&contador3==2&&contador4==2){
	if(inicio[0]!=1){
		inicio[0]=1;
		return inicio;
	}
	if(inicio[1]!=1){
		inicio[1]=1;
		return inicio;
	}
	if(inicio[2]!=1){
		inicio[2]=1;
		return inicio;
	}
	if(inicio[4]!=1){
		inicio[4]=1;
		return inicio;
	}
	if(inicio[7]!=1){
		inicio[7]=1;
		return inicio;
	}
	if(inicio[9]!=1){
		inicio[9]=1;
		return inicio;
	}
	if(inicio[10]!=1){
		inicio[10]=1;
		return inicio;
	}if(inicio[11]!=1){
		inicio[11]=1;
		return inicio;
	}
}	

		
		
		
		return null;
	}


}
