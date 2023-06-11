package javaTutorialTR.src.ch08_Loops.Tasks8_forLoop002;

public class for_Loop {
    public static void main(String[] args) {
        for (int satir = 1; satir < 6; satir++) {
            for (int bosluk = 1; bosluk < satir; bosluk++) {
                System.out.print(" ");

            }
            for (int rakam = satir; rakam <=6; rakam++) {
                System.out.print(rakam);
            }
            System.out.println();
        }
    }
}
