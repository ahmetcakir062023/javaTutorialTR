package javaTutorialTR.src.ch08_Loops.Tasks8_forLoop002;

import java.util.Scanner;

public class for_Loop2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int row=7;
        int number=1;
        for (int i = 0; i < row; i++) {
            for (int j = row; j >=i; j--) {
                System.out.print(" ");

            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
