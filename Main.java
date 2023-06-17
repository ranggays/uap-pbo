import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek karcis mobil
        Scanner in = new Scanner(System.in);
        System.out.println("---------STRUK PARKIR---------------");
        System.out.print("\nMasukkan Nama Penjaga : ");
        String nama = in.nextLine();
        System.out.print("\nMasukkan Jenis Kendaraan : ");
        String jenis = in.nextLine();
        if(jenis.equals("Motor")){
            // Membuat objek karcis motor
            System.out.print("\nMasukkan Waktu Masuk : ");
            double masuk = in.nextDouble();
            System.out.print("\nMasukkan Waktu Keluar : ");
            double keluar = in.nextDouble();
            KarcisMotor karcisMotor = new KarcisMotor("B 5678 XYZ", masuk, keluar);
            karcisMotor.displayStruk();
        }else if(jenis.equals("Mobil")){
            System.out.print("\nMasukkan Waktu Masuk : ");
            double masuk = in.nextDouble();
            System.out.print("\nMasukkan Waktu Keluar : ");
            double keluar = in.nextDouble();
            KarcisMobil karcisMobil = new KarcisMobil("B 1234 ABC", masuk, keluar);
            karcisMobil.displayStruk();
            System.out.print("Harga diskon : " + karcisMobil.hitungHargaParkir(masuk, keluar));        
            System.out.println("------------------------");
        }else{
            //polymorphisme
            System.out.print("\nMasukkan Waktu Masuk : ");
            double masuk = in.nextDouble();
            System.out.print("\nMasukkan Waktu Keluar : ");
            double keluar = in.nextDouble();
            Karcis karcis = new KarcisMotor("N 123 AS", masuk, keluar);
            karcis.displayStruk();
            //KarcisMobil karcisMobil = (KarcisMobil) new KarcisMotor();
            //karcisMobil.displayStruk();
        }
        
    }
} 
