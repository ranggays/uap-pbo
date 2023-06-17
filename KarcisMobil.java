import java.util.ArrayList;
import java.util.Random;

public class KarcisMobil extends Karcis {

    private String nomorPlat;
    private ArrayList<String>mobil=new ArrayList<String>();
    private final double diskon = 0.5; 

    public KarcisMobil(){
        
    }
    public KarcisMobil(String nomorPlat, double waktuMasuk, double waktuKeluar) {
        super("Mobil", waktuMasuk, waktuKeluar);
        this.nomorPlat = nomorPlat;
    }

    public String getMobil(){
        Random rand = new Random();
        mobil.add("Civic");
        mobil.add("Mazda");
        mobil.add("Fortuner");
        mobil.add("GTR");
        
        int randMobil = rand.nextInt(mobil.size());
        String suhu = mobil.get(randMobil); 
        return suhu;
    }
    
    public String getNomorPlat() {
        return nomorPlat;
    }

    public double hitungHargaParkir(){
        return (waktuKeluar-waktuMasuk)*hargaMobil;
    }

    public double hitungHargaParkir(double aktuMasuk, double aktuKeluar){
        double akhir = 0;
        if((aktuKeluar-aktuMasuk)>2){
            double diskonParkir = ((aktuKeluar-aktuMasuk)*hargaMobil)*diskon;
            akhir = ((aktuKeluar-aktuMasuk)*hargaMobil)-diskonParkir;
        }
        return akhir;
    }
    
    public void displayStruk() {
        super.displayStruk();
        System.out.println("Jenis Mobil: " + getMobil());
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Harga Parkir: Rp " + (double) hitungHargaParkir());
        System.out.println("==================================");
    }
}
