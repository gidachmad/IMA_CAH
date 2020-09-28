import java.util.Scanner;

class TugasPraktikum4Soal2{
  public static void main(String[] args) {
    //Deklarasi Scanner
    Scanner input = new Scanner(System.in);

    //input banyak telur dan hitung harga harga total
    System.out.print("Silakan masukan jumlah butir telur yang dibeli: ");
    int banyakTelur = input.nextInt();
    //hitung dan list harga
    int hargaTelur = 800;
    int hargaTotal = banyakTelur * hargaTelur;

    //output, deklarasi diskon dan lain lain
    if( banyakTelur < 12 ){
      float diskon0 = 0f; int diskon00 = (int) diskon0;
      float jumlahDiskon0 =  hargaTotal * diskon0;
      int jumlahDiskon1 = (int) jumlahDiskon0;
      System.out.println("Telur " + banyakTelur + " X Rp." + hargaTelur + " = Rp." + hargaTotal);
      System.out.println("Diskon " + diskon00 + "% = Rp." + jumlahDiskon1);
      System.out.println("Total dibayar = Rp." + (hargaTotal-jumlahDiskon1));
    }else if( banyakTelur >= 12 && banyakTelur <= 23 ) {
      float diskon1 = 0.1f; int diskon11 = (int) diskon1 + 10;
      float jumlahDiskon0 =  hargaTotal * diskon1;
      int jumlahDiskon1 = (int) jumlahDiskon0;
      System.out.println("Telur " + banyakTelur + " X Rp." + hargaTelur + " = Rp." + hargaTotal);
      System.out.println("Diskon " + diskon11 + "% = Rp." + jumlahDiskon1);
      System.out.println("Total dibayar = Rp." + (hargaTotal-jumlahDiskon1));
    }else{
      float diskon2 = 0.15f; int diskon21 = (int) diskon2 + 15;
      float jumlahDiskon0 =  hargaTotal * diskon2;
      int jumlahDiskon1 = (int) jumlahDiskon0;
      System.out.println("Telur " + banyakTelur + " X Rp." + hargaTelur + " = Rp." + hargaTotal);
      System.out.println("Diskon " + diskon21 + "% = Rp." + jumlahDiskon1);
      System.out.println("Total dibayar = Rp." + (hargaTotal-jumlahDiskon1));
    }
  }
}
