public class MainKue {
    public static void main(String[] args) {
        Kue[] kueList = new Kue[20];
    
        kueList[0] = new KuePesanan("Brownies", 125000, 1.5);
        kueList[1] = new KuePesanan("Donat", 8000, 1.4);
        kueList[2] = new KuePesanan("Lapis Legit", 150000, 2.1);
        kueList[3] = new KuePesanan("Bolu Kukus", 10000, 2.2);
        kueList[4] = new KuePesanan("Kastengel", 120000, 2);
        kueList[5] = new KuePesanan("Roti Sobek", 7000, 1.1);
        kueList[6] = new KuePesanan("Nastar", 135000, 1.2);
        kueList[7] = new KuePesanan("Onde-onde", 6000, 2.1);
        kueList[8] = new KuePesanan("Putri Salju", 115000, 2);
        kueList[9] = new KuePesanan("Pastel", 5500, 2.3);
        kueList[10] = new KueJadi("Bika Ambon", 145000, 10);
        kueList[11] = new KueJadi("Serabi", 4000, 12);
        kueList[12] = new KueJadi("Kue Lumpur", 95000, 5);
        kueList[13] = new KueJadi("Klepon", 3500, 10);
        kueList[14] = new KueJadi("Dadar Gulung", 110000, 8);
        kueList[15] = new KueJadi("Pukis", 5000, 11);
        kueList[16] = new KueJadi("Kue Cubit", 100000, 12);
        kueList[17] = new KueJadi("Apem", 3000, 14);
        kueList[18] = new KueJadi("Lemper", 105000, 7);
        kueList[19] = new KueJadi("Kue Soes", 4500, 20);

        // a
        System.out.println("===============================================================");
        System.out.println("                       DAFTAR KUE");
        System.out.println("===============================================================");

        for (Kue kue : kueList) {
            System.out.println(kue);
        }

        System.out.println("===============================================================");

        // b
        double totalHargaSemua = 0;
        for (Kue kue : kueList) {
            totalHargaSemua += kue.hitungHarga();
        }
        System.out.printf(">> Total Harga Semua Kue        : Rp%,.2f\n", totalHargaSemua);

        double totalHargaPesanan = 0, totalBerat = 0;
        double totalHargaJadi = 0, totalJumlah = 0;

        for (Kue kue : kueList) {
            if (kue instanceof KuePesanan) {
                // c
                totalHargaPesanan += kue.hitungHarga();
                totalBerat += ((KuePesanan) kue).getBeratKg();
            } else if (kue instanceof KueJadi) {
                // d
                totalHargaJadi += kue.hitungHarga();
                totalJumlah += ((KueJadi) kue).getJumlahItem();
            }
        }

        System.out.printf(">> Total Harga Kue Pesanan      : Rp%,.2f\n", totalHargaPesanan);
        System.out.printf(">> Total Berat Kue Pesanan      : %.2f kg\n", totalBerat);
        System.out.printf(">> Total Harga Kue Jadi         : Rp%,.2f\n", totalHargaJadi);
        System.out.printf(">> Total Jumlah Kue Jadi        : %.0f buah\n", totalJumlah);

        // e
        Kue kueTermahal = kueList[0];
        for (Kue kue : kueList) {
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }

        System.out.println("===============================================================");
        System.out.println("                  KUE DENGAN HARGA TERTINGGI");
        System.out.println("===============================================================");
        System.out.println(kueTermahal);
        System.out.println("===============================================================");
    }
}
