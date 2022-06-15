package estruturas_repetitivas;

import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros que voce deseja digitar:");

        int N = sc.nextInt();

        System.out.println("Agora voce precisa digitar " + N + " numeros:" );

        int soma = 0;
        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("A soma dos numeros digtados foi: " + soma);

        sc.close();

        //Contagem regressiva

        System.out.println("Contagem regressiva:");
        for (int i=4; i>0; i--){
            System.out.println("Valor de i= " + i);
        }
    }
}
