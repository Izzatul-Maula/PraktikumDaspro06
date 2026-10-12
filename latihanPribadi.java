import java.util.Scanner;
    public class latihanPribadi {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double diskon = 5000, jumlahBeli, kembalian, totalBayar, pembayaran;
            int hargaPaket = 10000;
            System.out.print("Masukkan Total Pembelian Paket Data: ");
            jumlahBeli = sc.nextDouble();
            
            if (jumlahBeli >= 5){
                totalBayar = jumlahBeli * hargaPaket - diskon;
                System.out.print("Total Pembayaran Paket Data: " + totalBayar); 
                System.out.print("\nTotal Diskon: " + diskon);
                System.out.print("\nMasukkan jumlah Pembayaran: ");
                pembayaran = sc.nextDouble();

                kembalian = pembayaran - totalBayar;
                System.out.print("Kembalian: " + kembalian);
            } else {
                totalBayar = jumlahBeli * hargaPaket;
                System.out.print("Total Pembayaran Paket Data: " + totalBayar);
            }
            
        }
    }