import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int total = 0;       
        int jumlah;           
        
        for (int hari = 1; hari <= 7; hari++) {
            System.out.print("Jumlah roti terjual hari ke-" + hari + ": ");
            jumlah = input.nextInt();
            total += jumlah;   
        }
        
        double rata = total / 7.0;  
        
        System.out.println("\nTotal roti selama 7 hari: " + total);
        System.out.println("Rata-rata per hari: " + rata);
    }
}
