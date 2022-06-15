package estruturas_repetitivas;

import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int x = sc.nextInt();

        //Mostra a soma dos valores digitados antes do zero
        int soma = 0;

        while (x != 0) {
            soma+=x;
            x = sc.nextInt();

        }

        System.out.println("Total: " + soma);
        sc.close();
    }
}
