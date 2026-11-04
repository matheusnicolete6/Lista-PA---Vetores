package listaVetores;

import java.util.Scanner;

public class ExCatorze {

	public static void main(String[] args) {
		final int TAM = 10;
		int i, a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		Scanner in = new Scanner(System.in);
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor de A");
			a[i] = in.nextInt();
			
			if(a[i] % 2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
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
