class KuePesanan extends Kue {
    private double beratKg;

    public KuePesanan(String namaKue, double hargaSatuan, double beratKg) {
        super(namaKue, hargaSatuan);
        this.beratKg = beratKg;
    }

    public double getBeratKg() {
        return beratKg;
    }

    @Override
    public double hitungHarga() {
        return getHargaSatuan() * beratKg;
    }

    @Override
    public String toString() {
        return String.format("%s | Berat: %.2f kg | Total Harga: Rp%,.2f",
                super.toString(), beratKg, hitungHarga());
    }
}