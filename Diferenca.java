package listaVetores;

import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], c[], i, j, k = 0, cont;
        a = new int [TAM];
        b = new int [TAM];
        c = new int [TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor de A:");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor de B:");
            b[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            cont = 0;
            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    cont++;
                }
            }
            if (cont == 0) {
                c[k] = a[i];
                k++;
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
		for(i = 0; i < k; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("]");
		
        in.close();
    }
}
