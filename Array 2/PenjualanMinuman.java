import java.util.Scanner;

public class PenjualanMinuman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis = 5;
        int total = 0;
        
        for (int a = 1; a < jenis; a++) {
            for (int b = 1; b < jenis; a++){
                System.out.print("masukkkan jumlah minuman : ");
                jenis = sc.nextInt();

                total += jenis;

            } if (jenis != 0) {
                System.out.println("tidak memilih");

            }
        }
        System.out.println("total minuman : " + total);
    }
}
