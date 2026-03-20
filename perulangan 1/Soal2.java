import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, mahasiswa = 30, i = 1, lulus = 0, tidaklulus = 0;

        while (i <= mahasiswa) {
            System.out.print("masukkan nilai mahasiswa ke - " + i + " : " );
            nilai = sc.nextInt();
            if (nilai >= 70) {
                lulus++;
            } else {
                tidaklulus++;
                break;
            }
            i++;
        }
        System.out.println("jumlah mahasiswa lulus : " + lulus);
        System.out.println("jumlah mahasiswa tidak lulus : " + tidaklulus);
    }
}
