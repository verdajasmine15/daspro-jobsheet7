import java.util.Scanner;
public class siakadFor30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i +":");
            nilai = mine.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi:" + tertinggi);
        System.out.println("Nilai terendah:" + terendah);
    }
}
