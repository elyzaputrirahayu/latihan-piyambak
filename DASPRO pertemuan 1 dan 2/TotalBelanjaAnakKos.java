import java.util.Scanner;

public class TotalBelanjaAnakKos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int NasiGoreng = 12000;
        int EsTeh = 3000;

        System.out.print("masukkan harga makanan : ");
        int hargaMakanan = sc.nextInt();

        System.out.print("masukkan harga minuman : ");
        int hargaMinuman = sc.nextInt();

        int hitungTotal = hargaMakanan + hargaMinuman;

        System.out.println("total yang harus dibayar = " + hitungTotal);
    }
}

// bisa uyyy