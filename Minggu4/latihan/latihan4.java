import java.util.Scanner;

class latihan4{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int angka0 = input.nextInt();
    int angka1 = input.nextInt();
    int angka2 = input.nextInt();

    if (angka0 < angka1 && angka1 < angka2) {
      System.out.println(angka0 + ", " + angka1 + ", " + angka2);
    }else if (angka1 < angka2 && angka2 < angka0) {
      System.out.println(angka1 + ", " + angka2 + ", " + angka0 );
    }else if (angka2 < angka0 && angka0 < angka1) {
      System.out.println(angka2 + ", " + angka0 + ", " + angka1);
    }else if (angka0 < angka2 && angka2 < angka1) {
      System.out.println(angka0 + ", " + angka2 + ", " + angka1);
    }else if (angka1 < angka0 && angka0 < angka2) {
      System.out.println(angka1 + ", " + angka0 + ", " + angka2 );
    }else {
      System.out.println(angka2 + ", " + angka1 + ", " + angka0);
    }
  }
}
