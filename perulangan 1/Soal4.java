import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kode;
        int jumlahValid = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Masukkan kode barang ke-" + i + ": ");
            kode = input.nextInt();

            if (kode == 999) {
                break;  // hentikan input
            }

            jumlahValid++; // barang valid
        }

        System.out.println("\nJumlah barang valid yang dimasukkan: " + jumlahValid);
    }
}
