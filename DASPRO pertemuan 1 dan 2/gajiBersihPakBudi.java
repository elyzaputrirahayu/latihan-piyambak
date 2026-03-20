import java.util.Scanner;

public class gajiBersihPakBudi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok = 4000000;
        int tunjanganMakan = 25000;
        double potongan = 0.05;

        System.out.print("masukkan berapa hari bekerja : ");
        int hari = sc.nextInt();

        int hitungtunjanganmakan = tunjanganMakan*hari;
        double hitungpotongangaji = gajiPokok*potongan;

        double hitunggaji = gajiPokok - hitungpotongangaji  + hitungtunjanganmakan;

        System.out.println("jadi gaji bersih pak budi adalah " +hitunggaji);
    }
}

// yey bisa