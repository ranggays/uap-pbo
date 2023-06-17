public abstract class Karcis {

    protected String jenisKendaraan;
    protected double waktuMasuk;
    protected double waktuKeluar;
    protected static double hargaMobil = 10000;
    protected static double hargaMotor = 10000;

    public Karcis(){
        
    }
    public Karcis(String jenisKendaraan, double waktuMasuk, double waktuKeluar) {
        this.jenisKendaraan = jenisKendaraan;
        this.waktuMasuk = waktuMasuk;
        this.waktuKeluar = waktuKeluar;
    }
    
    public String getJenisKendaraan() {
        return jenisKendaraan;
    }
    
    public double getWaktuMasuk() {
        return waktuMasuk;
    }
    
    public double getWaktuKeluar(){
        return waktuKeluar;
    }

    public abstract double hitungHargaParkir();

    public void displayStruk() {
        System.out.println("========== Struk Parkir ==========");
        System.out.println("Jenis Kendaraan: " + jenisKendaraan);
        System.out.println("Waktu Masuk: " + waktuMasuk);
        System.out.println("Waktu Keluar: " + waktuKeluar);
        //System.out.println("Harga Parkir: Rp " + hitungHargaParkir());
        System.out.println("==================================");    }
}