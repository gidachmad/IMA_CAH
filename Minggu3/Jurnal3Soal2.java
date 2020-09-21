import java.util.Scanner;

class Jurnal3Soal2{
  public static void main(String[] args) {
    //deklarasikan fungsi scanner untuk input
    Scanner input = new Scanner(System.in);

    //input nama matkul
    System.out.print("Masukan nama mata kuliah favorit: ");
    String matkul = input.nextLine();

    //input jam matkul perminggu
    System.out.print("Berapa jam mata kuliah tersebut dalam waktu satu minggu? ");
    int jamMatkul = input.nextInt();

    //hitung keinginan jam matkul perminggu
    int jamMatkulDikali2 = jamMatkul*2;

    //output
    System.out.println("Aku suka kuliah " + matkul + ".");
    System.out.println("Kuliah " + jamMatkul + " jam perminggu rasanya kurang.");
    System.out.println("Tambahin dong jadi " + jamMatkulDikali2 + " jam perminggu. :) " );
  }
}
