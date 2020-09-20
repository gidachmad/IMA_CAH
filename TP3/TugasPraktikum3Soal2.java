// Import class Scanner
import java.util.Scanner;

class TugasPraktikum3Soal2 {
  public static void main(String[] args) {
    //buat scanner 
    Scanner objek = new Scanner(System.in);

    //masukan nama
    System.out.println("Masukan nama lengkapmu:");
    String nama = objek.nextLine();
    //masukan umur
    System.out.println("Masukan umurmu:");
    int umur = objek.nextInt();

    //print nama dan umur
    System.out.println("Halo, " + nama + ".");
    System.out.println("Ternyata usiamu baru " + umur + " tahun ya!");
  }
}
