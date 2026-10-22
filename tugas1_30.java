import java.util.Scanner;
public class tugas1_30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);
        int tiket;
        int totalTiket = 0;
        double totalPenjualan = 0;
        double harga, diskon;

        System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
        tiket = mine.nextInt();

        while (tiket != 0) {
            if (tiket < 0) {
                System.out.println("Input tidak valid! Masukkan ulang.");
            } else {
                harga = tiket * 50000;
                if (tiket > 10) {
                    diskon = 0.15;
                } else if (tiket > 4) {
                    diskon = 0.10;
                } else {
                    diskon = 0;
                }

                harga = harga - (harga * diskon);

                totalTiket += +tiket;
                totalPenjualan += + harga;
                 System.out.println("Harga setelah diskon: Rp" + harga);
            }

            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            tiket = mine.nextInt();
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

        
        
        


    }
    
}
