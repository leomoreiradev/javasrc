package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class MainDoWhile {

//    Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
//    Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
//    programa.
//    Formula: F = 9C/5 + 32

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa de conversão de temperatura iniciado: ");
        char resposta;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = (9 * C) / 5.0 + 32;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

        System.out.println("Fim do programa");

        sc.close();

    }
}
