package listaVetores;

import java.util.Scanner;

public class Intersecao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], c[], i, j, k = 0;
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
            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                    break;
                }
            }
        }
        
        
        for (i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }

        in.close();
    }
}