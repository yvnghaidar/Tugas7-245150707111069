class KueJadi extends Kue {
    private double jumlahItem;

    public KueJadi(String namaKue, double hargaSatuan, double jumlahItem) {
        super(namaKue, hargaSatuan);
        this.jumlahItem = jumlahItem;
    }

    public double getJumlahItem() {
        return jumlahItem;
    }

    @Override
    public double hitungHarga() {
        return getHargaSatuan() * jumlahItem * 2;
    }

    @Override
    public String toString() {
        return String.format("%s | Jumlah: %.0f buah | Total Harga: Rp%,.2f",
                super.toString(), jumlahItem, hitungHarga());
    }
}