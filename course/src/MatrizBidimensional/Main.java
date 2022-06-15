package MatrizBidimensional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do tamanho da matriz bidimensional:");
        int n = sc.nextInt();

        //Matriz de n linhas e n colunas;
       int[][] mat = new int[n][n];
        System.out.println("Digite os valores:");
        //Percorrendo a linha cada linha
        for (int i = 0; i < n; i++) {
            //Para cada linha terá um for percorrendo as colunas
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");

        }


    }
}
