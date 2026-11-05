package listaVetores;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		int a[], b[], i, j;
		final int TAM=20;
		a = new int [TAM];
		b = new int [TAM];
		
		j=0;
		Scanner in = new Scanner (System.in);
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor de A");
			a[i] = in.nextInt();
			
			if(a[i] % 2 == 0) {
				b[j] = a[i];
				j++;
			}
		}
		
		for(i=0;i<TAM;i++) {
			if(a[i]%2==0) {
				
			}else {
				b[j] = a[i];
				j++;
			}
		}
	
			
		System.out.print("\n A = [");
		for(i = 0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		System.out.print("\n B = [");
		for(i = 0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		
		
		in.close();

	}

}
