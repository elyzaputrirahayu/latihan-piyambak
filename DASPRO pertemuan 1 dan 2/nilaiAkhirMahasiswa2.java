import java.util.Scanner;

public class nilaiAkhirMahasiswa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nilai Akhir Mahasiswa dihitung dari :");
        System.out.println("1. Tugas = 30%");
        System.out.println("2. UTS = 30%");
        System.out.println("3. UAS = 40%");

        double tugas = 0.30;
        double UTS = 0.30;
        double UAS = 0.40;

        System.out.print("Masukkan nilai Tugas : ");
        double nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUTS = sc.nextDouble();

        System.out.print("Masukkan nilai UAS : ");
        double nilaiUAS = sc.nextDouble();

        double totalNilaiAkhir = nilaiTugas*tugas + nilaiUAS*UAS + nilaiUTS*UTS;
        System.out.println("jadi total nilai akhirnya adalah " +totalNilaiAkhir);

        if (totalNilaiAkhir >= 60 && nilaiUAS >= 50 ) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}
// alhamdulillah bisa