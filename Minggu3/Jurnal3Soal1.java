import java.util.Scanner;

class Jurnal3Soal1{
  public static void main(String[] args) {
    //deklarasikan fungsi scanner untuk input
    Scanner input = new Scanner(System.in);

    //input bilangan bulat
    System.out.print("Silakan masukan bilangan bulat: ");
    int bilangan = input.nextInt();

    //hitung sehingga menghasilkan kuadrat dari bilangan yang diinput
    int hasil = bilangan*bilangan;

    //output bilangan yang sudah dikuadratkan
    System.out.println("berikut adalah bilangan kuadratya: " + hasil);
  }
}
