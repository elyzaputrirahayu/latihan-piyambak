import java.util.Scanner;

public class sistemPendaftaranLomba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan umur peserta lomba : ");
        int umurpeserta = sc.nextInt();

        if (umurpeserta < 17) {
            System.out.println("belum memenuhi syarat");
        } else if (umurpeserta > 30) {
            System.out.println("melebihi batas umur");
        } else {
            System.out.println("umur valid, pendataran diterima");
        }
    }
}
// yeyy bisa