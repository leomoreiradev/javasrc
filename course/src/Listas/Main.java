package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //Add elemento na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //Add elemento em determinada posição da lista
        list.add(2, "Marco");


        System.out.println("-------------Retornando todos que começam com a letra A-------------");

        List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());

        System.out.println("-------------Lista depois de filtrar e retornar elementos que começam com a letra 'A'-------------");

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------Trazer o primeiro elemento que começa com a letra 'A'-------------");

        //Aqui retorna um optional, pois usando o orElse ele retona o elemento ou caso não existe ele retorna null
        String name = list.stream().filter(x-> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);

        //Tamanho da lista
        System.out.println("Tamanho da lista: " + list.size());

        System.out.println("-------------Lista Original-------------");

        for (String x : list) {
            System.out.println(x);
        }


        //Removendo elemnento pelo valor
        list.remove("Anna");

        //Removendo elemnento pela posicao
        list.remove(1);

        //Removendo elemnento atraves de predicado
        //Remover todos string x tal que o inicio da string comece com o caracter 'M'
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("-------------Lista Modificada com remoções-------------");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------Retornando o index do elemento-------------");
        //Quando  existe o elemento procurado retorna o index
        System.out.println("O index do Bob é:" + list.indexOf("Bob"));


        System.out.println("-------------Quando o index do elemento não é encontrado-------------");
        //Quando não existe o elemento procurado retorna -1
        System.out.println("O index do Marco é:" + list.indexOf("Marco"));
    }
}
