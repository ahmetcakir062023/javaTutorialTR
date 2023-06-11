package javaTutorialTR.src.ch08_Loops.Tasks8_forLoop002;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */
        Scanner input =new Scanner(System.in);
        System.out.println(" Sayi Giriniz..");
        int sayi1=input.nextInt();
        System.out.println(" Sayi Giriniz..");
        int sayi2=input.nextInt();
        for (int i = (sayi1<sayi2?sayi1:sayi2); i <(sayi1>sayi2?sayi1:sayi2) ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }


        }

    }






















