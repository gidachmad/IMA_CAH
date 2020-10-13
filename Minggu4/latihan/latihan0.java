import java.util.Scanner;

class latihan0{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int angka = input.nextInt();
    if(angka > 0){
      System.out.println("Bilangan positif");
    }else if(angka < 1){
      System.out.println("Bilangan negatif");
    }else{
      System.out.println("bilangan nol = netral");
    }
  }
}
