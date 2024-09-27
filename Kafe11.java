
import java.util.Scanner;

 class Kafe11
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    String menu;
    char ukuranCup;
    int jumlah;
    boolean keanggotaan,cup = true;
    
    System.out.print("Masukkan menu: ");
    menu = sc.nextLine();
    
    System.out.print("Masukkan ukuran cup: ");
    ukuranCup = sc.next().charAt(0);
    
    System.out.print("Masukkan jumlah: ");
    jumlah = sc.nextInt();
    
    System.out.print("Masukkan keanggotaan (true/false): ");
    keanggotaan = sc.nextBoolean();
    
    double hargaMenu = 0;
    
    switch (menu.toLowerCase()){
      case "kopi" :
        hargaMenu = 12000;
        break;
      case "teh" :
        hargaMenu = 7000;
        break;
      case "coklat" :
        hargaMenu = 20000;
        break;
      default:
        hargaMenu = 0 ;
    }
    
    double totalHarga = hargaMenu * jumlah;
    
    switch (ukuranCup){
      case 'S' :
        break;
      case 'M' :
        totalHarga += 0.25 * totalHarga;
        break;
      case 'L' :
        totalHarga += 0.4 * totalHarga;
        break;
      default:
        cup = false;
    }
    
    if (cup) {
      double diskon = keanggotaan ? 0.1 : 0;
      double nominalBayar = totalHarga - (totalHarga * diskon);
      
      System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
      System.out.println("Nominal bayar: " + nominalBayar);
    } else{
      System.out.println("Size tidak tersedia");
    }
   }
 }
