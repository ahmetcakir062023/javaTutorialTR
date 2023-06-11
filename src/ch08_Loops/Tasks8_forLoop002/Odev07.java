package javaTutorialTR.src.ch08_Loops.Tasks8_forLoop002;

public class Odev07 {
    public static void main(String[] args) {
        /*
         *
         * *
         * ! *
         * ! ! *
         * ! ! ! *
         * ! ! ! ! *
         * ! ! ! ! ! *
         * * * * * * * *

         */
            int satirSayisi=8;
        for (int i = 1; i <= satirSayisi; i++) {
            System.out.println(" ");
            for (int k = 1; k <= i; k++) {
                if (k==1||k==i||k==satirSayisi||i==satirSayisi){
                    System.out.print("* ");
                }else {
                    System.out.print("! ");

                }

            }

        }

    }












}
