import java.util.Scanner;

class Jurnal3Soal3{
  public static void main(String[] args) {
    //deklarasikan fungsi scanner untuk input
    Scanner input = new Scanner(System.in);

    //input nilai praktikum
    System.out.print("Masukan nilai praktikum anda: ");
    int nilaiPraktikum = input.nextInt();

    //input nilai asesmen pertama
    System.out.print("Masukan nilai asesmen pertama anda: ");
    int nilaiAsesmen1 = input.nextInt();

    //input nilai asesmen kedua
    System.out.print("Masukan nilai asesmen kedua anda: ");
    int nilaiAsesmen2 = input.nextInt();

    //hitung nilai
    float parameter1 = 25/100f;
    float parameter2 = 35/100f;
    float parameter3 = 40/100f;

    float nilaiTotal = (parameter1*nilaiPraktikum) + (parameter2*nilaiAsesmen1) + (parameter3*nilaiAsesmen2);
    //output nilai
    System.out.println("Selamat! nilai anda adalah " + nilaiTotal);

  }
}
