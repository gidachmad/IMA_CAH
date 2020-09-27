import java.util.Scanner;

class Modul3Soal1_1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String jawaban;
    int inputan, jumlahPenumpang;
    boolean pernyataan;

    inputan = 0;
    jumlahPenumpang = 0;
    pernyataan = true;
    jawaban = " ";
    while ( pernyataan != false ){
      System.out.print("Berapa orang yang anda angkut sekarang? ");
      inputan = input.nextInt();
      jumlahPenumpang = jumlahPenumpang + inputan;
      System.out.println("Jumlah penumpang yang sudah anda angkut sebanyak " + jumlahPenumpang + " orang.");
      System.out.println("Apakah anda ingin melanjutkan perhitungan? Pilih antara \'Ya\' atau \'Tidak\' ");
      jawaban = input.nextLine();
      if ( jawaban == "ya" ){
        pernyataan = true;
      }else{
        pernyataan = false;
      }

    }
  }
}
