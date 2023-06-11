package javaTutorialTR.src.ch08_Loops.Tasks8_forLoop002;

public class Odev01 {

    public static void main(String[] args) {

        //    0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.

        //Kodu aşağıya yazınız.
        int toplam=0;
        for (int i = 0; i <= 100; i+=2) {
            toplam+=i;

        }
        System.out.println("toplam = " + toplam);


    }
}
