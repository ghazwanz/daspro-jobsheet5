import java.util.Scanner;

 class PemilihanHariDenganIf11
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    String dayType;
    int num;
    
    System.out.print("Input day in number: ");
    num = sc.nextInt();
    
    if (num > 0 && num <=5)
    {
      dayType = "weekday";
    }
    else if (num > 5 && num <=7)
    {
      dayType = "weekend";
    } else {
      dayType = "Invalid Number";
    }
    System.out.println("Day " + num + " is a " + dayType);
   }
 }
