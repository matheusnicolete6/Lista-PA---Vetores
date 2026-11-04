package listaVetores;

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		final int TAM=10;
		int a[], i, div = 0, j;
		a = new int [TAM];
		Scanner in = new Scanner (System.in);
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um número e descubra se ele é primo");
			a[i] = in.nextInt();
			
		}
		
		for(i=0; i<TAM; i++) {
			div=0;
			for(j = 2; j<a[i]; j++) {
				
				if( a[i] % j == 0) {
					div++;
				} 	
			}
			
			if(div==0 && a[i]>1) {
				System.out.println(a[i] + " primo");
			}
			else {
				System.out.println(a[i] + " não é primo");
			}
			
		}
		
		
		
		in.close();
	}

}
