import java.util.Scanner;
public class latihanPribadi01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String tipeKamar, vipMember;
    int durasiInap, jumlahTamu;
    double pajak = 0.1, diskonHotel;
    int  biayaTambahan = 75000, diskonVip, totalBreakfast, biayaHotel, totalBiaya;

    System.out.print("\n-----------TIPE KAMAR-----------");
    System.out.print("\nStandard Room : Rp. 500.000");
    System.out.print("\nDeluxe Room   : Rp. 850.000");
    System.out.print("\nSuite Room: Rp. 1.500.000");
    System.out.print("\n---------------------------------");
    System.out.print("\nMasukkan tipe kamar (Standard/Deluxe/Suite): ");
    tipeKamar = sc.nextLine();
    System.out.print("Masukkan jumlah orang: ");
    jumlahTamu = sc.nextInt();
    System.out.print("Masukkan durasi inap (dalam hari): ");
    durasiInap = sc.nextInt();
    System.out.print("Apakah Anda adalah member VIP? (ya/tidak): ");
    vipMember = sc.next();

    if (tipeKamar.equalsIgnoreCase("Standard")) {
        biayaHotel = 500000 * durasiInap;
    } else if (tipeKamar.equalsIgnoreCase("Deluxe")) {
        biayaHotel = 850000 * durasiInap;
    } else if (tipeKamar.equalsIgnoreCase("Suite")) {
        biayaHotel = 1500000 * durasiInap;
    } else {
        System.out.println("Tipe kamar tidak valid.");
        return;
    }
        if (durasiInap > 7) {
            diskonHotel = biayaHotel * 0.15;
        } else if (durasiInap > 3 && durasiInap <= 6) {
            diskonHotel = biayaHotel * 0.10;
        } else {
            diskonHotel = 0;
        }
        if (vipMember.equalsIgnoreCase("ya")) {
            diskonVip = (int)(biayaHotel * 0.5);
        } else {
            diskonVip = 0;
        }

        totalBreakfast = jumlahTamu * biayaTambahan * durasiInap;
        totalBiaya = (int)(biayaHotel - diskonHotel - diskonVip + totalBreakfast + (biayaHotel * pajak));

        System.out.println("\n -----------RINCIAN BIAYA-------------");
        System.out.println("Tipe Kamar      : " + tipeKamar);
        System.out.println("Jumlah Tamu     : " + jumlahTamu);
        System.out.println("Biaya Hotel     : Rp. " + biayaHotel);
        System.out.println("Diskon Hotel    : Rp. " + diskonHotel);
        System.out.println("Diskon VIP      : Rp. " + diskonVip);
        System.out.println("Biaya Breakfast : Rp. " + totalBreakfast);
        System.out.println("Pajak           : Rp. " + (biayaHotel * pajak));
        System.out.println("\n--------------------------------------");
        System.out.println("Total Biaya     : Rp. " + totalBiaya);
        
    }

}
