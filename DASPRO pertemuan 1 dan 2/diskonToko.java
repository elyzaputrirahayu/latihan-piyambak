import java.util.Scanner;

public class diskonToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon;
        double totalbayar;

        System.out.print("masukkan total belanja : ");
        double totalbelanja = sc.nextDouble();

        if (totalbelanja >= 500000) {
            diskon = totalbelanja*0.10;
        } else {
            diskon = totalbelanja*0.05;
        }

        totalbayar = totalbelanja - diskon;

        System.out.println("mendapat diskon sebesar : " +diskon);
        System.out.println("pelanggan membayar sebesar : " +totalbayar);
    }
}
// yey bisa