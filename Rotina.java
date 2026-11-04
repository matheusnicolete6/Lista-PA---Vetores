package listaVetores;

import java.util.Scanner;

public class Rotina {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, x, p;
		a = new int [TAM];

		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i+1) + "° valor:");
			a[i] = in.nextInt();
		}
		
		System.out.println("Digite o valor que deseja saber se está armazenado:");
		x = in.nextInt();
		
		p = -1;
		
		for (i = 0; i < TAM; i++) {
			if (x == a[i]) {
				p = i;
			}
		}
		
		if (p == -1) {
			System.out.println("Não armazenado");
		}
		else {
			System.out.println("Armazenado");
		}
		in.close();
	}

}
