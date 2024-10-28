import java.util.Scanner;

        //1. Sebelum Refactor
public class PenghitungNilaiSebelumRefactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        //5. Sebelum Refactor
        int totalNilai = 0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            int nilai = scanner.nextInt();
            totalNilai += nilai;
        }

        //3. Sebelum Refactor
        double rataRata = totalNilai / (double) jumlahSiswa;

        //4. Sebelum Refactor
        System.out.println("Rata-rata nilai: " + rataRata);
        //2. Sebelum Refactor
        if (rataRata >= 75) {
            System.out.println("Keterangan: Lulus");
        } else {
            System.out.println("Keterangan: Tidak Lulus");
        }

        scanner.close();
    }
}
