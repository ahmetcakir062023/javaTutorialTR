package javaTutorialTR.src.ch08_Loops.Tasks8_forLoop002;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının hesap eden code create ediniz
         */
        int toplam=0;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("sayi gir");
            int sayi=scan.nextInt();
            if(sayi<10||sayi>20) toplam+=sayi;

        }
        System.out.println("toplam = " + toplam);


    }
}
