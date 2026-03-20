import java.util.Scanner;

public class kelilingdanLuasPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan sisi persegi : ");
        int sisi = sc.nextInt();

        int keliling = 4*sisi;
        int luas = sisi*sisi;

        System.out.println("jadi keliling persegi tersebut adalah " +keliling);
        System.out.println("jadi luas persegi tersebut adalah " +luas);
    }
}

// yey bisaa