import java.util.Scanner;

class TP02{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int bil = input.nextInt();
    int balik = 0;
    while (bil != 0){
      balik *= 10;
      balik = balik + bil % 10;
      bil /= 10;
    }
    System.out.println(balik);
  }
}
