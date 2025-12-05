import java.util.Scanner;

public class RekapPenjualanCafe14 {

    static void inputData(int[][] data, String[] menu, int jumlahHari) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilTabel(int[][] data, String[] menu, int jumlahHari) {
        System.out.println("\n=== TABEL PENJUALAN ===");

        System.out.print("Menu\t\t");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.print("H" + h + " ");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8)
                System.out.print("\t");

            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void menuTertinggi(int[][] data, String[] menu, int jumlahHari) {

        int maxTotal = -1;
        int indeksMax = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;

            for (int j = 0; j < jumlahHari; j++) {
                total += data[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indeksMax = i;
            }
        }

        System.out.println("\n=== MENU PENJUALAN TERTINGGI ===");
        System.out.println("Menu  : " + menu[indeksMax]);
        System.out.println("Total : " + maxTotal);
    }

    static void rataRataMenu(int[][] data, String[] menu, int jumlahHari) {
        System.out.println("\n=== RATA-RATA PENJUALAN MENU ===");

        for (int i = 0; i < menu.length; i++) {
            int total = 0;

            for (int j = 0; j < jumlahHari; j++) {
                total += data[i][j];
            }

            double rata = total / (double) jumlahHari;
            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah menu
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); // buang newline

        // Input jumlah hari
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        // Input nama menu
        String[] menu = new String[jumlahMenu];
        System.out.println("\nMasukkan nama-nama menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        // Buat array 2D sesuai input
        int[][] data = new int[jumlahMenu][jumlahHari];

        // Panggil fungsi-fungsi
        inputData(data, menu, jumlahHari);
        tampilTabel(data, menu, jumlahHari);
        menuTertinggi(data, menu, jumlahHari);
        rataRataMenu(data, menu, jumlahHari);

        sc.close();
    }
}
