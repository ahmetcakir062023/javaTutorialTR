package javaTutorialTR.src.ch08_Loops.Tasks8_forLoop002;

public class Task05_Nestedfor {
    public static void main(String[] args) {
        /*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print((i * j)+"  ");
            }
            System.out.println();
        }



    }
}
