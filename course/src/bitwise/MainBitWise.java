package bitwise;

public class MainBitWise {
    public static void main(String[] args) {
        int n1 = 89; // 0101 1001
        int n2 = 60; // 0011 1100

        //O bitwise verifica bit a bit

        //1 - 1 = 1
        //1 - 0 = 0
        //0 - 0 = 0
        //0 - 1 = 0
        System.out.println(n1 & n2);

        //1 - 1 = 1
        //1 - 0 = 1
        //0 - 0 = 0
        //0 - 1 = 1
        System.out.println(n1 | n2);


        //Quando somente um for verdadeiro
        //1 - 1 = 0
        //1 - 0 = 1
        //0 - 0 = 0
        //0 - 1 = 1
        System.out.println(n1 ^ n2);
    }
}
