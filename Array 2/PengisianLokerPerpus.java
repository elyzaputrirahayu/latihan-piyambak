import java.util.Scanner;

public class PengisianLokerPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] rakloker = new int [4][5];
        

        for (int i = 0; i < rakloker.length; i++) {
            for (int k = 0; k < rakloker[i].length; k++) {
                rakloker[i][k] = i + k;
                System.out.print(rakloker[i][k] + " ");
            }
            System.out.println();
        }
    }
}
