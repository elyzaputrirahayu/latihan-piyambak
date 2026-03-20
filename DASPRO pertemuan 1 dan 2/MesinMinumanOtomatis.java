import java.util.Scanner;

public class MesinMinumanOtomatis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaMinuman = 8000;
        
        System.out.println("Mesin hanya menerima uang : ");
        System.out.println("1. Rp 5.000");
        System.out.println("2. Rp 10.000");
        System.out.println("--------------------------------");
        System.out.print("Masukkan jumlah uang yg akan dibayar : ");
        int UangBayar = sc.nextInt();

        if (UangBayar == 0 ) {
            System.out.println("Belum bayar");
        } else if (UangBayar != 5000 && UangBayar != 10000) {
            System.out.println("Uang tidak diterima mesin");
        } else if (UangBayar < hargaMinuman) {
            System.out.println("Uang tidak cukup");
        } else if (UangBayar == hargaMinuman) {
            System.out.println("Uang pas, Terima Kasih");
        } else {
            int kembalian = UangBayar - hargaMinuman;
            System.out.println("Kembalian : Rp " +kembalian);
        }
    }
}
// yey bisa