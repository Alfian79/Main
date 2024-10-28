import java.util.Scanner;

public class TicketBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jenis Tiket (reguler/terusan): ");
        String jenisTiket = scanner.nextLine();

        System.out.print("Masukkan Kategori Usia (dewasa/anak-anak): ");
        String kategoriUsia = scanner.nextLine();

        System.out.print("Masukkan Hari (Senin, Selasa, Rabu, Kamis, Jumat, Sabtu, Minggu): ");
        String hari = scanner.nextLine();

        System.out.print("Masukkan Tanggal Keberangkatan (dd-MM-yyyy): ");
        String tanggal = scanner.nextLine();

        // Validasi jika salah satu data kosong
        if (nama.isEmpty() || jenisTiket.isEmpty() || kategoriUsia.isEmpty() || hari.isEmpty() || tanggal.isEmpty()) {
            System.out.println("Data harus diisi.");
        } else {
            // Hitung harga tiket
            double hargaTiket = hitungHargaTiket(jenisTiket, kategoriUsia);

            // Cek apakah hari adalah Sabtu atau Minggu, jika ya harga naik 20%
            if (hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu")) {
                hargaTiket += hargaTiket * 0.20;  // Tambahkan 20% dari harga normal
            }

            // Output hasil
            System.out.println("Nama Pengguna: " + nama);
            System.out.println("Jenis Tiket: " + jenisTiket);
            System.out.println("Kategori Usia: " + kategoriUsia);
            System.out.println("Hari: " + hari);
            System.out.println("Tanggal: " + tanggal);
            System.out.printf("Total Harga Tiket: Rp%.0f\n", hargaTiket);
        }
    }

    // Method untuk menghitung harga tiket berdasarkan jenis tiket dan kategori usia
    public static double hitungHargaTiket(String jenisTiket, String kategoriUsia) {
        double harga = 0;

        // Tentukan harga berdasarkan jenis tiket dan kategori usia
        if (jenisTiket.equalsIgnoreCase("reguler")) {
            if (kategoriUsia.equalsIgnoreCase("dewasa")) {
                harga = 75000;  // Harga reguler dewasa
            } else if (kategoriUsia.equalsIgnoreCase("anak-anak")) {
                harga = 60000;  // Harga reguler anak-anak
            }
        } else if (jenisTiket.equalsIgnoreCase("terusan")) {
            if (kategoriUsia.equalsIgnoreCase("dewasa")) {
                harga = 100000;  // Harga terusan dewasa
            } else if (kategoriUsia.equalsIgnoreCase("anak-anak")) {
                harga = 85000;  // Harga terusan anak-anak
            }
        }

        return harga;
    }
}
