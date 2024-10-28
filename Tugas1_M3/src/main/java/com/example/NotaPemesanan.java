package com.example;

import java.util.Scanner;

public class NotaPemesanan {
    // Atribut untuk menyimpan detail pesanan
    private final String namaPelanggan;
    private final String namaMakanan;
    private final int jumlahPesanan;
    private final double harga;
    private double diskon;

    // Konstruktor untuk inisialisasi data
    public NotaPemesanan(String namaPelanggan, String namaMakanan, int jumlahPesanan, double harga) {
        this.namaPelanggan = namaPelanggan;
        this.namaMakanan = namaMakanan;
        this.jumlahPesanan = jumlahPesanan;
        this.harga = harga;
        this.diskon = 0.0;
    }

    // Method untuk menghitung total harga pesanan dengan diskon
    public double hitungTotal() {
        double total = jumlahPesanan * harga;
        return total - (total * diskon);
    }

    // Method untuk menampilkan nota pemesanan
    public void tampilkanNota() {
        System.out.println("===== Rumah Makan Padang Sari Nikmat =====");
        System.out.printf("Nama Pelanggan : %s%n", namaPelanggan);
        System.out.printf("Nama Makanan   : %s%n", namaMakanan);
        System.out.printf("Jumlah Pesanan : %d%n", jumlahPesanan);
        System.out.printf("Harga per Porsi: Rp %.2f%n", harga);
        System.out.printf("Diskon         : %.0f%%%n", diskon * 100);
        System.out.printf("Total Harga    : Rp %.2f%n", hitungTotal());
        System.out.println("===========================================");
    }

    // Method untuk menerapkan diskon
    public void terapkanDiskon(double diskon) {
        this.diskon = diskon;
    }

    public static void main(String[] args) {
        // Menggunakan scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Rumah Makan Padang Sari Nikmat!");
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan nama makanan: ");
        String namaMakanan = scanner.nextLine();

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();

        System.out.print("Masukkan harga per porsi: ");
        double harga = scanner.nextDouble();

        // Membuat objek NotaPemesanan
        NotaPemesanan nota = new NotaPemesanan(namaPelanggan, namaMakanan, jumlahPesanan, harga);

        // Menerapkan diskon 10% jika jumlah pesanan lebih dari 5
        if (jumlahPesanan > 5) {
            nota.terapkanDiskon(0.10); // 10% diskon
        }

        // Menampilkan nota
        nota.tampilkanNota();
    }
}


