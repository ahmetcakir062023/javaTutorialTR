package javaTutorialTR.src.ch08_Loops.Tasks8_forLoop002;

public class Odev04 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
            int sayi=1;
        for (int i = 1; i <=5 ; i++) {
            sayi=i;
            for (int j = 1; j <=i ; j++) {
                System.out.print(sayi+ " ");
                sayi+=5-j;

            }
                System.out.println(" ");
        }




    }
}
