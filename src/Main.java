import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner giris = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        sicaklik = giris.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak");
        } else if (sicaklik <= 25) {
            if (sicaklik <= 15) {
                System.out.println("Sinema");
            }
            if (sicaklik >= 10) {
                System.out.println("Piknik");
            }
        } else {
            System.out.println("Yüzme");
        }
    }
}

