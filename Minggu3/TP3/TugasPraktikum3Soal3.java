//Import class Scanner
import java.util.Scanner;

class TugasPraktikum3Soal3{
  public static void main(String[] args) {
    //buat Scanner
    Scanner objek = new Scanner(System.in);

    // masukan jumlah permen yang akan dibagikan
    System.out.println("Masukan jumlah permen yang ingin dibagikan: ");
    int jumlahPermen = objek.nextInt();
    // masukan jumlah anak yang akan dibagikan permen
    System.out.println("Masukan jumlah anak yang akan dibagikan permen: ");
    int jumlahAnak = objek.nextInt();

    //hitung jumlah permen yang dibagikan dan sisanya
    int permenUntukDibagi = jumlahPermen / jumlahAnak ;
    int permenSisa = jumlahPermen % jumlahAnak ;

    //print jumlah permen yang dibagikan dan sisanya
    System.out.println("Jumlah permen yang dibagikan per anak secara adil : " + permenUntukDibagi);
    System.out.println("Jumlah permen yang tersisa : " + permenSisa);
  }
}
