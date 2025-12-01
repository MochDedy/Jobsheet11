import java.util.Scanner;
import java.awt.Menu;

public class Kafe14 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon untuk setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon sebesar 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon sebesar 30%!");
        } else {
            System.out.println("Diskon anda tidak valid!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga14(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            int diskon = hargaTotal / 2;
            hargaTotal -= diskon;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            int diskon = hargaTotal * 30 / 100;
            hargaTotal -= diskon;
        } else {
            System.out.println("Anda tidak memiliki diskon!");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kodePromo = "DISKON50";
        int totalKeseluruhan = 0;

        Menu("Dedy", true, kodePromo);

        System.out.println("Halo! berapa menu yang ingin anda pesan?");
        int jumlahJenis = sc.nextInt();

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + i);

            System.out.print("\nMasukkan pilihan menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yangin ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalPermenu = hitungTotalHarga14(pilihanMenu, banyakItem, kodePromo);

            System.out.println("Total harga pesanan ke-" + i + ": Rp." + totalPermenu);

            totalKeseluruhan += totalPermenu;

        }

        System.out.println("\nTotal harga pesanan anda adalah Rp." + totalKeseluruhan);

    }
}