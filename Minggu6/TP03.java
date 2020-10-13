import java.util.Scanner;

class TP03{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int bil1;
    int hitung = 0;
    do {
      bil1 = input.nextInt();
      hitung = hitung + bil1;
    } while (bil1 != 0);

    System.out.println(hitung);
  }
}
