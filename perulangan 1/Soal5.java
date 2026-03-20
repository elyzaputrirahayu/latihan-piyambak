import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jam;
        int totalJam = 0;

        for (int hari = 1; hari <= 10; hari++) {
            System.out.print("Jam belajar hari ke-" + hari + ": ");
            jam = input.nextInt();

            if (jam > 12) {
                continue; // skip input yang tidak valid
            }

            totalJam += jam; // ditambahkan hanya jika valid
        }

        System.out.println("\nTotal jam belajar valid: " + totalJam);
    }
}
