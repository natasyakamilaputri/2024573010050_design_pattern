package modul_1.latihan;

import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args){
        Scanner input = new
                Scanner(System.in);
        System.out.println("masukkan angka:");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("bilangan genap");
        } else {
            System.out.println("bilangan ganjil");
        }
    }
}
