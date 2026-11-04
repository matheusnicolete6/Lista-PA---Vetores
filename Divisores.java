package listaVetores;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		final int TAM = 10;
		int i, j = 0, a[];
		a = new int [TAM];
		Scanner in = new Scanner(System.in);
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° numero para descobrir seus divisores");
			a[i] = in.nextInt();
		}
		
		System.out.print("\n A = [");
		for(i = 0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		System.out.println();
		
		for(i=0; i<TAM; i++) {
			
			j=1;
			
			System.out.print(a[i]+ " = ");
			
			while(j<=a[i]) {
				
				if(a[i] % j == 0) {
					System.out.print(j + " ");
				}
				j++;
			}
			System.out.println();
		}
		
		in.close();
		
	}

}
