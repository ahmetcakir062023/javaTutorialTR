package javaTutorialTR.src.ch08_Loops.Tasks08_forLoop1;

public class Odev03 {

    public static void main(String[] args) {

        /* İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

         */
        int toplam=0;
        for (int i = 0; i <=10 ; i++) {
            toplam+=i;

        }
        System.out.println("toplam = " + toplam);


    }
}
