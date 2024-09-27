import java.util.Scanner;

public class PengkategorianUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kategori = "usia tidak valid";
        byte usia;

        System.out.print("Masukkan usia: ");
        usia = input.nextByte();

        if (usia >= 0 && usia <=12 ) {
            kategori = "anak";
        }
        else if (usia >12 && usia <=19 ) {
            kategori = "remaja";
        }
        else if (usia >19 && usia <=64 ) {
            kategori = "dewasa";
        }
        else if (usia >64) {
            kategori = "lansia";
        }

        System.out.println("Usia " + usia + " tahun merupakan fase " + kategori);
        
    }   
}
