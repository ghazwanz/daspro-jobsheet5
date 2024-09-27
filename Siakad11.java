import java.util.Scanner;

public class Siakad11 {
    public static void main(String[] args) {
        // Deklarasi Input
        Scanner sc = new Scanner(System.in);

        // Deklarasi Variabel
        String nama,nim,kelas,kualifikasi,huruf;
        byte absen;
        double nilaiKuis,nilaiTugas,nilaiUjian,nilaiAkhir,nilaiSetara;

        System.out.print("Masukkan nama: ");
        nama=sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim=sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas=sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen=sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis=sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas=sc.nextDouble();
        System.out.print("Masukkan nilai Ujian: ");
        nilaiUjian=sc.nextDouble();

        nilaiAkhir = (nilaiKuis+nilaiTugas+nilaiUjian)/3;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            huruf = "A";
            kualifikasi = "Sangat Baik";
            nilaiSetara=4;
        }else if (nilaiAkhir > 73 && nilaiAkhir<= 80) {
            huruf = "B+";
            kualifikasi = "Lebih Dari Baik";
            nilaiSetara=3.5;
        }
        else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            huruf = "B";
            kualifikasi = "Baik";
            nilaiSetara=3;
        }
        else if (nilaiAkhir >60 && nilaiAkhir <= 65) {
            huruf = "C+";
            kualifikasi = "Lebih dari cukup";
            nilaiSetara=2.5;
        }
        else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            huruf = "C";
            kualifikasi = "Cukup";
            nilaiSetara=2;
        }
        else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            huruf = "D";
            kualifikasi = "Kurang";
            nilaiSetara=1;
        }
        else if (nilaiAkhir <= 39 && nilaiAkhir > 0) {
            huruf = "E";
            kualifikasi = "Gagal";
            nilaiSetara=0;
        } else{
            huruf = "Invalid";
            kualifikasi = "Invalid";
            nilaiSetara = 0;
        }
        System.out.print("Mahasiswa dengan nama "+nama+" (NIM: "+nim + ") ");
        System.out.println("kelas: "+kelas+" nomor absen: "+absen);
        System.out.println("Nilai Akhir: "+nilaiAkhir);
        System.out.println("Nilai Akhir Huruf: "+huruf);
        System.out.println("Nilai Setara: "+nilaiSetara);
        System.out.println("Kualifikasi: "+kualifikasi);

        sc.close();
    }
}
