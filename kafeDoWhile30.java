import java.util.Scanner;
public class kafeDoWhile30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

        int kopi,teh,roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;
        

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
            String namaPelanggan = mine.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            
            System.out.print("Jumlah kopi:");
            kopi = mine.nextInt();
            System.out.print("Jumlah teh:");
            teh = mine.nextInt();
            System.out.print("Jumlah roti:");
            roti = mine.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp" + totalHarga);
            mine.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    
    }
    
}
