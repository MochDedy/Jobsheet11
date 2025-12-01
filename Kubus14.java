import java.util.Scanner;

public class Kubus14 {

    static int hitungVolume(int sisi) {
        int hitungVolume = sisi * sisi * sisi;
        return hitungVolume;
    }

    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====MENGHITUNG KUBUS====");

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("====HASIL PERHITUNGAN KUBUS====");
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);

        sc.close();
    }
}
