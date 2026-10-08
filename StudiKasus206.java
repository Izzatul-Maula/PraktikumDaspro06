import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int juara, jumlahDokumen, kurang, statusPkm;
        String namaMahasiswa, jenis;

        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        
        System.out.print("Masukkan pilihan kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya): ");
        jenis = sc.nextLine();

        System.out.print("Jumlah dokumen yang sudaf dikumpulkan ke siakad (0-4): ");
        jumlahDokumen = sc.nextInt();

       if (jenis.equalsIgnoreCase("BELMAWA") || 
            jenis.equalsIgnoreCase("BAKORMA") || 
            jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara : ");
            juara = sc.nextInt();
            if (jumlahDokumen == 4) {
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status : Dokumen lengkap. Selamat! Anda mendapatkan dana penghargaan.");
                } else {
                    System.out.println("Status : Dokumen lengkap. Namun, dana penghargaan hanya diberikan untuk Juara 1, 2, atau 3.");
                }
            } else {
                kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }    
        } else {
            System.out.println("Tidak ada dana penghargaan untuk kegiatan ini");
        }
            
        if (jenis.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPkm = sc.nextInt();

            if (jumlahDokumen == 4) {
                if (statusPkm == 1) {
                    System.out.println("Status : Dokumen lengkap. Selamat! Tim PKM lolos pendanaan dan berhak menerima dana penghargaan.");
                } else {
                    System.out.println("Status : Dokumen lengkap. Namun, tim tidak lolos pendanaan sehingga dana penghargaan tidak diberikan.");
                }
            } else {
                kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
            
                
        }
    }
    
}