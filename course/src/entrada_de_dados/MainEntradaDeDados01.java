package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class MainEntradaDeDados01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char w;

		//Lendo o caractere
		x = sc.next();
		//Lendo numeros
		y = sc.nextInt();
		z = sc.nextDouble();
		w = sc.next().charAt(0);

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		
		
		sc.close();
		

	}

}
