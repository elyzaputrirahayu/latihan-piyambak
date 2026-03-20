import java.util.Scanner;

public class nilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai mahasiswa : ");
        double nilai = sc.nextDouble();

        if (nilai >= 85) {
            System.out.println("A");
        } else if (nilai >= 70 ) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else {
            System.out.println("nilai E");
        }

        System.out.println("ini adalah nilai mahasiswa " +nilai);
    }
}
 // yeyy bisa