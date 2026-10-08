import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int jenis, juara, jumlahDokumen, kurang, statusPkm;
        String namaMahasiswa;

        System.out.println("Nama Mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.println("Pilihan Jenis Kegiatan");
        System.out.println("1. Lomba (BELMAWA, BAKORMA, MANDIRI)");
        System.out.println("2. Program Kreatifitas Mahasiswa (PKM)");
        System.out.println("3.Lainnya)");
        System.out.println("Masukkan pilihan kegiatan (1,2,3): ");
        jenis = sc.nextInt();
        if (jenis == 1 || jenis == 2 || jenis == 3){
            System.out.println("Masukkan peringkat juara (1-4): ");
            juara = sc.nextInt();
            if (juara ==1 || juara == 2 || juara == 3 || juara == 4){
                System.out.println("Masukkan jumlah dokumen yang sudah dikumpulkan ke siakad (0-4): ");
                jumlahDokumen = sc.nextInt();
                if (jumlahDokumen == 4){
                    System.out.println("Selamat, anda berhak mendapatkan sertifikat dan dana penghargaan");
                } else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println("Maaf, anda belum melengkapi persyaratan dokumen diSIAKAD");
                }
            } else {
                System.out.println("Maaf, Dana penghargaan hanyaa diberikkan kepada pendanaan");
            }
        } else {
            System.out.println("Maaf, pilihan kegiatan tidak valid");
        }
    }
}