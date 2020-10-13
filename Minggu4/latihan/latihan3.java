import java.util.Scanner;

class latihan3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int angka0 = input.nextInt();
    int angka1 = input.nextInt();
    if (angka0 < angka1) {
      System.out.println(angka0 + ", " + angka1);
    }else{
      System.out.println(angka1 + ", " + angka0);
    }
  }
}
