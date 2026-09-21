package pkg23_laundry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat scanner untuk input pengguna
        Scanner masuk = new Scanner(System.in);
        // Deklarasi referensi tipe parent class (LayananLaundry)
        LayananLaundry layanan = null; // Parent class reference
        int pilihan;
        boolean ulang = true;
        int saldoAwal = 200000; 
        int saldo = saldoAwal;

        while (ulang) {
            System.out.println("----Laundry Sepatu----");
            System.out.println("Saldo Anda saat ini: Rp. " + saldo);
            System.out.println("1. Cuci Sepatu (Rp. 50,000)");
            System.out.println("2. Treatment Sepatu (Rp. 70,000)");
            System.out.println("3. Repair Sepatu (Rp. 100,000)");
            System.out.print("Pilih layanan: ");
            pilihan = masuk.nextInt();

            //Polimorfisme: Menggunakan referensi kelas induk untuk menunjuk ke objek kelas anak.
            if (pilihan == 1) {
                layanan = new CuciSepatu();
            } else if (pilihan == 2) {
                layanan = new TreatmentSepatu();
            } else if (pilihan == 3) {
                layanan = new RepairSepatu();
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih ulang.");
                continue;
            }

            int harga = layanan.getHarga();

            // check saldo
            if (saldo >= harga) {
                saldo -= harga;

                // invoice
                System.out.println("=====================");
                System.out.println("INVOICE");
                System.out.println("Layanan yang Anda pesan: " + layanan.getLayanan());
                System.out.println("Tagihan: Rp. " + harga);
                System.out.println("Saldo sebelum transaksi: Rp. " + (saldo + harga)); 
                System.out.println("Saldo setelah transaksi: Rp. " + saldo);
                System.out.println("=====================");
            } else {
                System.out.println("Maaf, saldo Anda tidak mencukupi untuk layanan ini.");
            }

            // bertanya apa ada pesanan lain?
            System.out.print("Ingin memesan layanan lain? (ya/tidak): ");
            String jawaban = masuk.next();

            if (!jawaban.equalsIgnoreCase("ya")) {
                ulang = false; 
                System.out.println("Terima kasih telah menggunakan layanan kami!");
                System.out.println("Saldo akhir Anda: Rp. " + saldo);
            }
        }
    }
}








