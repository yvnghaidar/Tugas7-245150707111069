abstract class Kue {
    private String namaKue;
    private double hargaSatuan;

    public Kue(String namaKue, double hargaSatuan) {
        this.namaKue = namaKue;
        this.hargaSatuan = hargaSatuan;
    }

    public String getNamaKue() {
        return namaKue;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return String.format("Nama: %-20s | Harga Satuan: Rp%,.2f", getNamaKue(), getHargaSatuan());
    }
}