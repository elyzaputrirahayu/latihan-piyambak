import java.util.Scanner;

public class MembeliBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bukutulis = 5000;

        System.out.print("berapa banyak buku yang dibeli :");
        bukutulis = sc.nextInt();

        int hitungTotal = bukutulis*5000;
        System.out.println("Jadi total harganya adalah " +hitungTotal); 
    }
}

// yeyy bisa, semoga konsisten bisa kedepannya