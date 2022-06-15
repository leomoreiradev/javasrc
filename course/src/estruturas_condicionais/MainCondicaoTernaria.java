package estruturas_condicionais;

public class MainCondicaoTernaria {
    public static void main(String[] args) {

        //Sem o ternario
        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
            System.out.println("Desconto if Sem o ternario: " + desconto);
        }
        else {
            desconto = preco * 0.05;
            System.out.println("Desconto else Sem o ternario: " + desconto);
        }

        //Com ternario
        double preco2 = 34.5;
        double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;
        System.out.println("Desconto Com ternario: " + desconto2);

    }
}
