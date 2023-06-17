import java.util.ArrayList;
import java.util.Random;

class KarcisMotor extends Karcis {

    private String nomorPlat;
    private ArrayList<String>motor=new ArrayList<String>();
    
    public KarcisMotor(){

    }

    public KarcisMotor(String nomorPlat, double waktuMasuk, double waktuKeluar) {
        super("Motor", waktuMasuk, waktuKeluar);
        this.nomorPlat = nomorPlat;
    }
    
    public String getMotor(){
        Random rand = new Random();
        motor.add("Aerox");
        motor.add("Supra");
        motor.add("Vario");
        motor.add("Beat");
        
        int randMotor = rand.nextInt(motor.size());
        String suhu = motor.get(randMotor); 
        return suhu;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public double hitungHargaParkir(){
        return (waktuKeluar-waktuMasuk)*hargaMotor;
    }
    
    @Override
    public void displayStruk() {
        super.displayStruk();
        System.out.println("Jenis Motor: " + getMotor());
        System.out.println("Nomor Plat: " + nomorPlat);        
        System.out.println("Harga Parkir: Rp " + (double) hitungHargaParkir());
        System.out.println("==================================");
    }
}