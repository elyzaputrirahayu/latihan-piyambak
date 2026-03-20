import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0, harga, i = 1;
        do {
            System.out.print("masukkan harga minuman : " );
            harga = sc.nextInt();

            if (harga != 0) {
                total += harga;
            }
        } while ( harga != 0); {
         System.out.println("total pendapatan hari ini :" + total);
        }
    }
}
