import java.util.Scanner;
public class Ekspedisi {

    public static void main(String[] args) {
       
        Ekspedisi ekspedisi = new Ekspedisi();
        Scanner scanner = new Scanner(System.in);
    
          }
    }
        class Paket {
            String idPaket;
            String namaPelanggan;
            String alamatPengiriman;
            Date tanggalPengiriman;
            String tipePengiriman;
            long waktuPengiriman;

            daftarPaket.terimaKiriman(1, "Yuli", 5, "express", "Jl. Ciganitri no. 15"); 
            daftarPaket.terimaKiriman(2, "Kiki", 6, "kilat", "Jl. Pogor no. 11"); 
            daftarPaket.terimaKiriman(3, "Toto", 7, "biasa", "Jl. Sukabirus no. 15"); 
            daftarPaket.terimaKiriman(4, "Juni", 8, "express","Jl Telekomunikasi no. 2"); 
            daftarPaket.terimaKiriman(5, "Julia", 8, "Same day", "Jl. Ciganitri no. 13"); 
            daftarPaket.terimaKiriman(6, "Agus", 9, "biasa", "Jl. Ciganitri no. 23"); 
        

        public Paket(String idPaket, String namaPelanggan, String alamatPengiriman, Date tanggalPengiriman, String tipePengiriman) {
            this.idPaket = idPaket;
            this.namaPelanggan = namaPelanggan;
            this.alamatPengiriman = alamatPengiriman;
            this.tanggalPengiriman = tanggalPengiriman;
            this.tipePengiriman = tipePengiriman;
            this.waktuPengiriman = hitungWaktuPengiriman(tipePengiriman);
        }    
    

            private long hitungWaktuPengiriman(String tipe) {
        switch (tipe.toLowerCase()) {
            case "biasa":
                return 3 * 24 * 60 * 60 * 1000; // 3 hari
            case "express":
                return 2 * 24 * 60 * 60 * 1000; // 2 hari
            case "kilat":
                return 1 * 24 * 60 * 60 * 1000; // 1 hari
            case "same day":
                return 0; // hari yang sama
            default:
                return Long.MAX_VALUE; // tipe tidak valid
        }
    }
}
             


    



