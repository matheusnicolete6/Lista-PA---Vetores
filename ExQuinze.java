package listaVetores;

import java.util.Scanner;

public class ExQuinze {

	public static void main(String[] args) {
		final int TAM=10;
		int i, a[], b[], c[];
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		Scanner in = new Scanner(System.in);
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ " valor de A");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ " valor de B");
			b[i] = in.nextInt();
			
			if(a[i] > b[i]) {
				c[i] = 1;
			} else if(a[i] == b[i]) {
				c[i] = 0;
			} else {
				c[i] = -1;
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
		
		System.out.print("\n C = [");
		for(i = 0; i < TAM; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("]");
		
		
		in.close();
	}

}
