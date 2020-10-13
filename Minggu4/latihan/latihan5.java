import java.util.Scanner;

class latihan5{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("input kan koordinat x");
    int x1 = input.nextInt();
    int x2 = input.nextInt();
    int x = x1 - x2;
    //System.out.println("input kan koordinat y");
    //int y1 = input.nextInt();
    //int y2 = input.nextInt();
    
    //int y = y1 - y2;

    //double hasil = Math.sqrt(Math.abs(x)) + Math.sqrt(Math.abs(y));
    System.out.println(x1);
    System.out.println(x2);
    System.out.println(x);
    //System.out.println(y1);
    //System.out.println(y2);
    //System.out.println(y);
    //System.out.println((int)hasil);
  }
}
