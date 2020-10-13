import java.util.Scanner;

class TP02{
  public static void main(String[] args) {
    // Scanner
    Scanner input = new Scanner(System.in);

    // input
    int hari = input.nextInt();
    int hariIni = 5;

    int itung = (hari + hariIni) % 7;
    switch (itung){
      case 0 :
        System.out.print("dimanche");
        break;
      case 1 :
        System.out.print("lundi");
        break;
      case 2 :
        System.out.print("mardi");
        break;
      case 3 :
        System.out.print("mercredi");
        break;
      case 4 :
        System.out.print("jeudi");
        break;
      case 5 :
        System.out.print("vendredi");
        break;
      case 6 :
        System.out.print("samedi");
        break;
    }
  }
}
