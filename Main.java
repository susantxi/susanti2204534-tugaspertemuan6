package main;

/**
 *
 * @author susanti
 */

import java.util.Scanner;

class PersegiPanjang {
    private int panjang;
    private int lebar;

    public PersegiPanjang() {
        panjang = 0; lebar = 0;
    }

    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru; lebar = lebarBaru;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        System.out.println("Menu Untuk Melihat Hasil Dari Persegi Panjang:");
        System.out.println("1. Persegi Panjang 1");
        System.out.println("2. Persegi Panjang 2");
        System.out.println("3. Persegi Panjang 3");
        System.out.println("0. Exit\n");
        
        int pilihan;
        
        do{
            System.out.print("Masukan Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> {
                    System.out.println("Persegi Panjang 1:");
                    System.out.printf("Panjang: %d \n",persegiPanjang1.getPanjang());
                    System.out.printf("Lebar: %d \n", persegiPanjang1.getLebar());
                    System.out.printf("Luas: %d \n", persegiPanjang1.getLuas());
                    System.out.printf("Keliling: %d \n\n", persegiPanjang1.getKeliling());
                }
                case 2 -> {
                    System.out.println("Persegi Panjang 2:");
                    System.out.printf("Panjang: %d \n",persegiPanjang2.getPanjang());
                    System.out.printf("Lebar: %d \n", persegiPanjang2.getLebar());
                    System.out.printf("Luas: %d \n", persegiPanjang2.getLuas());
                    System.out.printf("Keliling: %d \n\n", persegiPanjang2.getKeliling());
                }
                case 3 -> {
                    System.out.println("Persegi Panjang 3:");
                    System.out.printf("Panjang: %d \n",persegiPanjang3.getPanjang());
                    System.out.printf("Lebar: %d \n", persegiPanjang3.getLebar());
                    System.out.printf("Luas: %d \n", persegiPanjang3.getLuas());
                    System.out.printf("Keliling: %d \n\n", persegiPanjang3.getKeliling());
                }
                default -> System.out.print("Pilihan tidak tersedia. \n\n");
                }
        }while(pilihan != 0);
    }
}