import java.util.Scanner;

class TugasPraktikum4Soal1{
  public static void main(String[] args) {
    //Deklarasi scanner
    Scanner input = new Scanner(System.in);

    //inputan bilangan
    System.out.print("Silakan inputkan angka enam: ");
    int bilangan = input.nextInt();

    // output jika benar memasukan angka 6
    if( bilangan == 6){
      System.out.println("Yeay!! inputnya Enam!! :D ");
    }else{
      System.out.println("Inputnya bukan Enam >:( ");
    }
  }
}
