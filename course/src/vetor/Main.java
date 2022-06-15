package vetor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do tamanho do vetor:");
        int n = sc.nextInt();

        Double[] vect = new Double[n];

        System.out.println("Digite a altura de cada pessoa:");

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }

        System.out.println("Autura da cada pessoa:");

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Altura: " + (i + 1) + " - " + vect[i]);
        }






    }
}
