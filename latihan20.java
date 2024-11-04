package pertemuan5new;

/**
 *
 * Nama : Tiara Aulia Maharani
 * NIM  : 23215039
 * TEKNIK INFORMATIKA
 * Latihan 19 Saldo Tabungan
 */
public class latihan20 {
    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bunga = 0.08;
        double saldoTarget = 6000000;
        int bulan = 0;

        System.out.println("Saldo Tabungan untuk mencapai target:");
        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * bunga;
            bulan++;
            System.out.printf("Saldo di bulan ke-%d: Rp %.2f%n", bulan, saldoAwal);
        }
    }
}


