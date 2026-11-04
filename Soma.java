package listaVetores;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		final int TAM = 10;
		int a[], b[], i, j, s;
		a = new int [TAM];
		b = new int [TAM];
		Scanner in = new Scanner(System.in);
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° número");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			s = 0;
			for(j=i; j<TAM; j++) {
				s = s + a[j];
				b[i] = s;
			}
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("A[" +(i+1)+ "] = " + a[i] + " | B[" + (i+1) + "] = " + b[i]);
		}
		
		in.close();
	}

}
