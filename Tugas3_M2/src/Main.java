// Kode Program Sebelum Refactoring
public class TiketPesawat extends TiketPesawat.Pemesanan implements TiketPesawat.Tiket {
    protected String nama;
    protected String asal;
    protected String tujuan;
    protected String Tiket;
    protected double diskon;

    public TiketPesawat(String nama, String asal, String tujuan, double hargatiket, TiketPesawat.info info)
    {
        this.nama = this.nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.Tiket = hargatiket;
        this.diskon = info.diskon();
    }

    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (diskon / 100));
    }
    public double hitungDiskon() {
        return Tiket * (diskon / 100);
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }
}
