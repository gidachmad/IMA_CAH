import java.util.Scanner;

class latihan1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int angka = input.nextInt();
    int hasil = angka % 2;
    if (hasil == 0) {
      System.out.println("ini bilangan genap");
    }else{
      System.out.println("ini bilangan ganjil");
    }
  }
}
