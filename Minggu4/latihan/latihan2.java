import java.util.Scanner;

class latihan2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan bilangan pecahan: ");
    double angka = input.nextDouble();
    int hasil = (int) angka;
    System.out.println(hasil);
  }
}
