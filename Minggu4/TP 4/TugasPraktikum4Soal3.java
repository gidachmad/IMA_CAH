import java.util.Scanner;

class TugasPraktikum4Soal3{
  public static void main(String[] args) {
    //deklarasi scanner
    Scanner input = new Scanner(System.in);

    //deklarasi variabel dan input nilai
    System.out.print("Silakan masukan nilai Radi: ");
    int nilaiRadi = input.nextInt();
    System.out.print("Silakan masukan nilai Dira: ");
    int nilaiDira = input.nextInt();
    System.out.print("Silakan masukan nilai Idar: ");
    int nilaiIdar = input.nextInt();

    //output
    if( nilaiRadi > nilaiDira && nilaiRadi > nilaiIdar ) {
      System.out.println("Pemenangnya adalah Radi!!");
    }else if ( nilaiDira > nilaiRadi && nilaiDira > nilaiIdar ) {
      System.out.println("Pemenangnya adalah Dira!!");
    }else{
      System.out.println("Pemenangnya adalah Idar!!");
    }
  }
}
