import java.util.Scanner;

public class NilaiMahasiswa14 {
    static void isianArray(int[] nilai) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        int[] nilaiMhs = new int[N];
        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hitTot(nilaiMhs);

        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

        input.close();
    }
}
