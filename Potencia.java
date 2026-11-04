package listaVetores;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		final int TAM = 11;
		int a[], i, j = 1, r = 1;
		a = new int [TAM];
		Scanner in = new Scanner(System.in);
		
		System.out.print("\nA[ ");
		for(i=0; i<TAM; i++) {
			
			System.out.print("2" + "^" + i + " ");
		}System.out.println("]");
		
		
		
		System.out.print("\nA[ ");
		for(i=0; i<TAM; i++) {
			r=1;
			for(j=1; j <= i; j++) {
				r = r * 2;
			}
			
			a[i] = r;
			System.out.print(a[i] + " ");
		}System.out.println("]");
		
		in.close();
	}

}
