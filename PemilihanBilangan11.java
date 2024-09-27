import java.util.Scanner;

 class PemilihanBilangan11
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan sebuah angka: ");
    int angka = sc.nextInt();
    // Metode If
    // if (angka %2 == 0)
    // {
    //   System.out.println("Angka "+angka+" termasuk bilangan genap");
    // }
    // else
    // {
    //   System.out.println("Angka "+angka+" termasuk bilangan ganjil");
    // }

    // Metode Ternary
    String hasil = angka %2 == 0 ? "genap" : "ganjil";
    
    System.out.println("Angka " + angka + " termasuk bilangan " + hasil);
   }
 }
