import java.util.Scanner;

public class promoToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Toko memberikan Promo : ");
        System.out.println("----------------------------------------------------------");
        System.out.println("Total belanja >= 1.000.000, diskon 20%");
        System.out.println("Total belanja >= 500.000, diskon 10%");
        System.out.println("Total belanja < 500.000, diskon 5%");
        System.out.println("Jika Pelanggan punya MEMBER CARD, dapat tambahan diskon 5%");
        System.out.println("----------------------------------------------------------");

        double bobotBelanja1 = 0.20;
        double bobotBelanja2 = 0.10;
        double bobotBelanja3 = 0.05;
        double diskonTambahan = 0.05;
        double diskon=0;
        double diskon2=0;
        double totalDiskon;
        double totalBayar;

        System.out.print("Masukkan Total Belanja : ");
        double TotBelanja = sc.nextDouble();

        if (TotBelanja >= 1000000) {
            diskon = TotBelanja*bobotBelanja1;
            System.out.println("Mendapat diskon : " +diskon);
        } else if (TotBelanja >= 500000) {
            diskon = TotBelanja*bobotBelanja2;
            System.out.println("Mendapat diskon : " +diskon);
        } else if (TotBelanja < 500000) {
            diskon = TotBelanja*bobotBelanja3;
            System.out.println("Mendapat diskon : " +diskon);
        }else {
            System.out.println("tidak mendapat diskon");
        }

        System.out.println("---------------------------------------------------------");
        System.out.print("Apakah Pelanggan membawa MEMBER CARD ? (Ya / Tidak) : ");
        int member = sc.nextInt();

        if (member == 1) {
            diskon2 = diskon*diskonTambahan;
        } else {
            System.out.println("tidak mendapatkan diskon tambahan");
        }

        totalDiskon = diskon + diskon2;
        System.out.println("Jadi Total diskon yang didapatkan sebesar " +totalDiskon);

        totalBayar = TotBelanja - totalDiskon;
        System.out.println("jadi total bayarnya adalah " +totalBayar);
    }
}
