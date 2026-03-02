package modul_1.latihan;

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args){
        Scanner input = new
                Scanner(System.in);

        System.out.println("Masukkan panjang: ");
        int panjang = input.nextInt();

        System.out.println("masukkan lebar:");
        int lebar = input.nextInt();
        int luas = panjang * lebar;

        System.out.println("Luas persegi panjang = " + luas);
    }
}
