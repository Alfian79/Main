import java.util.Scanner;

/**
 * Kelas PenghitungNilaiSetelahRefactor digunakan untuk menghitung rata-rata nilai siswa dan menentukan apakah siswa lulus atau tidak berdasarkan rata-rata nilai.
 *
 */

        //1. Sesudah Refactor(pemecahan fungsi besar menjadi kescil)
public class PenghitungNilaiSetelahRefactor {
    private static final Scanner scanner = new Scanner(System.in);


    /**
     * Metode utama yang menjalankan proses input jumlah siswa, menghitung total nilai,
     * menghitung rata-rata nilai, dan menampilkan hasil kelulusan.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */

    public static void main(String[] args) {
        int jumlahSiswa = getJumlahSiswa();
        int totalNilai = calculateTotalNilai(jumlahSiswa);
        double rataRata = calculateAverage(totalNilai, jumlahSiswa);
        displayResult(rataRata);
        scanner.close();
    }

    /**
     * Meminta pengguna untuk memasukkan jumlah siswa.
     *
     * @return jumlah siswa yang diinput oleh pengguna
     */

    private static int getJumlahSiswa() {
        System.out.print("Masukkan jumlah siswa: ");
        return scanner.nextInt();
    }

    /**
     * Menghitung total nilai dari semua siswa.
     *
     * @param jumlahSiswa jumlah siswa yang akan diinput nilainya
     * @return total nilai yang diperoleh dari seluruh siswa
     */

    //5. Sesudah Refactor(penggunaan parameter)
    private static int calculateTotalNilai(int jumlahSiswa) {
        int totalNilai = 0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            totalNilai += getNilaiSiswa(i);
        }
        return totalNilai;
    }

    /**
     * Meminta pengguna untuk memasukkan nilai siswa tertentu.
     *
     * @param siswaKe nomor urut siswa yang diminta nilainya
     * @return nilai yang diinput oleh pengguna
     */

    private static int getNilaiSiswa(int siswaKe) {
        System.out.print("Masukkan nilai siswa ke-" + siswaKe + ": ");
        return scanner.nextInt();
    }

    /**
     * Menghitung rata-rata nilai siswa.
     *
     * @param totalNilai total nilai dari semua siswa
     * @param jumlahSiswa jumlah siswa yang diinput
     * @return rata-rata nilai siswa
     */

    //3. Sesudah Refactor(penggunaan konversi tipe yang lebih jelas pada pembagian)
    private static double calculateAverage(int totalNilai, int jumlahSiswa) {
        return totalNilai / (double) jumlahSiswa;
    }

    /**
     * Menampilkan hasil rata-rata nilai dan status kelulusan siswa.
     *
     * @param rataRata rata-rata nilai siswa
     */

    //4. Sesudah Refactor(pemisahan tugas tampilan(output)
    private static void displayResult(double rataRata) {
        System.out.println("Rata-rata nilai: " + rataRata);

    //2. Sesudah Refactor(penggunaan tenary operator)
        String keterangan = (rataRata >= 75) ? "Lulus" : "Tidak Lulus";
        System.out.println("Keterangan: " + keterangan);
    }
}
