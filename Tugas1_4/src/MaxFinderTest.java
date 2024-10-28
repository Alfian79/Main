import java.util.Scanner;

public class MaxFinderTest {

    // Method untuk mencari nilai maksimum dari tiga bilangan
    public static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // Method main untuk menerima input dan menampilkan hasil
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.println("Masukkan tiga bilangan bulat: ");
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        System.out.print("Masukkan nilai c: ");
        int c = scanner.nextInt();

        // Menemukan nilai maksimum menggunakan findMax
        int maksimum = findMax(a, b, c);

        // Menampilkan hasil
        System.out.println("Nilai maksimum dari (" + a + ", " + b + ", " + c + ") adalah: " + maksimum);

        // Menutup scanner
        scanner.close();
    }
}
