import java.util.Scanner;

public class PengisianLokerBarang {
    public static void main(String[] args) {

        for ( int baris = 0; baris < 5; baris++ ) {
            for ( int kolom = 0; kolom < 4; kolom++)
                System.out.print((baris + kolom) + " ");
        }
        System.out.println();
    }
}

