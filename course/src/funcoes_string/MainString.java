package funcoes_string;

import java.util.Locale;

public class MainString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG  ";

        //Conveter para minusculas
        String s01 = original.toLowerCase();
        System.out.println("Original: - " + original  + "-");
        System.out.println("usando toLowerCase: - " + s01 + "-");

        //Conveter para maiusculas
        String s02 = original.toUpperCase();
        System.out.println("Original: - " + original  + "-");
        System.out.println("usando toLowerCase: - " + s02 + "-");

        //Elimina os espaços nos cantos da string
        String s03 = original.trim();
        System.out.println("Original: -" + original  + "-");
        System.out.println("usando trim: -" + s03 + "-");


        //Retorna uma string nova apartir de uma posição passado por parametro
        String s04 = original.substring(2);
        System.out.println("Original: -" + original  + "-");
        System.out.println("usando substring: -" + s04 + "-");

        //Retorna uma string nova apartir de uma posição inicial passado por parametro até uma posição final passado por parametro
        //Os numeros passados são as posições do caracter dentro da string
        String s05 = original.substring(2, 9);
        System.out.println("Original: -" + original  + "-");
        System.out.println("usando substring com 2 paramatros: -" + s05 + "-");

        //Troca um caracter por outro
        String s06 = original.replace('a', 'x');
        System.out.println("Original: -" + original  + "-");
        System.out.println("usando replace: -" + s06 + "-");

        //Troca um substring por outra
        String s07 = original.replace("abc", "xy");
        System.out.println("Original: -" + original  + "-");
        System.out.println("usando replace passando um substring: -" + s07 + "-");

        //Achar a posição (index) primeira  ocorrencia da substring bc
        int i = original.indexOf("bc");
        System.out.println("Primeira o ocorrencia do bc esta no index: " + i);

        //Achar a posição (index) da ultima ocorrencia da substring bc
        int j = original.lastIndexOf("bc");
        System.out.println("Ultima ocorrencia do bc esta no index: " + j);

        //Split tranforma uma string em variaveis de acordo com o separador
        // "potato apple lemon" -> neste caso o separador é o espaço
        String s1 = "potato apple lemon";
        String[] vect = s1.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);


        // "potato2, apple2, lemon2" -> neste caso o separador é a virgula
        String s2 = "potato2,apple2,lemon2";
        String[] vect2 = s2.split(",");
        System.out.println(vect2[0]);
        System.out.println(vect2[1]);
        System.out.println(vect2[2]);


    }
}
