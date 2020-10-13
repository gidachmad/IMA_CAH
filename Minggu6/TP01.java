import java.util.Scanner;

class TP01{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int amoebaAwal = 30;
    int waktu = 0;
    int amoebaAkhir = input.nextInt();
    while (amoebaAwal < amoebaAkhir) {
      amoebaAwal *= 2;
      waktu += 15;
    }
    System.out.println(waktu);
  }
}
