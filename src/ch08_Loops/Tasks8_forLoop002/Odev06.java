package javaTutorialTR.src.ch08_Loops.Tasks8_forLoop002;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input=new Scanner(System.in);
        System.out.println("1 den büyük tam sayı giriniz..");
        int sayi=input.nextInt();
        int toplam=0;
        if (sayi>1){
            for (int i = 0; i <= sayi; i++) {
                toplam+=i*i;

            }
            System.out.println(toplam);
        }else {
            System.out.println("Lütfen 1 den büyük sayi giriniz..");
        }


    }
}
