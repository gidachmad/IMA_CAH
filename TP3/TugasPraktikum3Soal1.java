// Import class Scanner
import java.util.Scanner;

class TugasPraktikum3Soal1 {
  public static void main(String[] args) {
    //buat scanner
    Scanner objek = new Scanner(System.in);

    //masukan jumlah uangyang ditabung perhari
    System.out.println("masukan tabungan perhari: ");
    int tabunganPerhari = objek.nextInt();
    //masukan jumlah hari
    System.out.println("Masukan jumlah hari: ");
    int jumlahHari = objek.nextInt();

    //kalikan agar mendapat hasil tabungan
    int hasilTabungan = jumlahHari * tabunganPerhari;
    //print jumlah uang yang berhasil ditabung
    System.out.println("Jumlah uang yang berhasil ditabung" + hasilTabungan);
  }
}
