import java.util.Scanner;

public class aplikasiParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan lama parkir (jam) : ");
        int jam = sc.nextInt();

        int biaya = 0;

        if (jam <= 0) {
            System.out.println("Lama parkir tidak valid");
        } else {
            biaya = 3000;

            if (jam > 1) {
                int jamTambahan = Math.min(jam - 1, 4);
                biaya += jamTambahan*2000;
            }

            if (jam > 5) {
                biaya += (jam - 5) * 1500;
            }

            if (jam > 8) {
                biaya += 5000;
            }

            System.out.println("Total biaya parkir : Rp " + biaya);
        }

        sc.close();
    }
}
