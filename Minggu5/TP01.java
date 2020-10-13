import java.util.Scanner;

class TP01{
  public static void main(String[] args) {
    // Deklarasi Scanner
    Scanner input = new Scanner(System.in);

    // input
    int bulan = input.nextInt();
    switch (bulan){
      case 1 :
        System.out.println("janvier");
        break;
      case 2 :
        System.out.println("février");
        break;
      case 3 :
        System.out.println("mars");
        break;
      case 4 :
        System.out.println("avril");
        break;
      case 5 :
        System.out.println("mai");
        break;
      case 6 :
        System.out.println("juin");
        break;
      case 7 :
        System.out.println("juillet");
        break;
      case 8 :
        System.out.println("Août");
        break;
      case 9 :
        System.out.println("septembre");
        break;
      case 10 :
        System.out.println("octobre");
        break;
      case 11 :
        System.out.println("novembre");
        break;
      case 12 :
        System.out.println("Décembre");
        break;
    }
  }
}
