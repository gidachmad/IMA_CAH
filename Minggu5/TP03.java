import java.util.Scanner;

class TP03{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String tipeBangun = input.nextLine();
    switch (tipeBangun) {
      case "Persegi" :
        int sisi = input.nextInt();
        System.out.println((sisi*sisi) + " " + (sisi*4));
        break;
      case "Persegi Panjang" :
        int panjang = input.nextInt();
        int lebar = input.nextInt();
        System.out.println((panjang*lebar) + " " + ((2*panjang)+(2*lebar)));
        break;
      case "Segitiga" :
        int alas = input.nextInt(); double alas0 = alas;
        int tinggi = input.nextInt();
        double sisi0 = Math.sqrt(Math.pow((alas0/2), 2) + Math.pow(tinggi, 2));
        double sisi1 = Math.round((sisi0 + sisi0));
        System.out.println((alas*tinggi/2) + " " + (int)(alas+sisi1));
        System.out.println(sisi0);
        System.out.println(sisi1);
        break;
      case "Lingkaran" :
        int diameter = input.nextInt();
        double jari2 = diameter/2;
        double phi = 3.14d;
        System.out.println((Math.pow(jari2, 2)*phi)+ " " + (phi*diameter));
        break;
    }
  }
}
