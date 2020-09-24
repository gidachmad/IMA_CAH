import java.util.Scanner;
// import untuk penggunaan desimal dengan format titik contoh: 12.50
// import java.util.Locale;

class Modul3Soal3{
  public static void main(String[] args) {
    //deklarasi fungsi Scanner
    Scanner input = new Scanner(System.in);
    // deklarasi fungsi scanner untuk penggunaan desimal dengan format titik contoh: 12.50
    // Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //bagian bilangan bulat
    System.out.print("Silakan masukan satu bilangan bulat: ");
    int bilBulat1 = input.nextInt();
    System.out.print("Silakan masukan bilangan bulat lainnya: ");
    int bilBulat2 = input.nextInt();
    // output bilangan bulat
    //penjumlahan
    System.out.println("Hasil dari penjumlahannya adalah " + (bilBulat1 + bilBulat2));
    //pengurangan
    System.out.println("Hasil dari pengurangannya adalah " + (bilBulat1 - bilBulat2));
    //perkalian
    System.out.println("Hasil dari perkaliannya adalah " + (bilBulat1 * bilBulat2));
    //pembagian
    System.out.println("Hasil dari pembagiannya adalah " + (bilBulat1 / bilBulat2));
    //sisa bagi atau modulo
    System.out.println("Sisa dari hasil pembagiannya adalah " + (bilBulat1 % bilBulat2));

    //bagian bilangan pecahan
    System.out.print("Sekarang silakan masukan satu bilangan pecahan: ");
    double bilPecahan = input.nextDouble();
    System.out.println("Sekarang kami akan mengoperasikan bilangan pecahan dengan bilangan bulat yang sudah anda input.\nBilangan mana yang anda ingin gunakan? \n" + bilBulat1 + " atau " + bilBulat2 + "?");
    int bilBulat = input.nextInt();
    // output bilangan bulat dengan bilangan pecahan
    //penjumlahan
    System.out.println("Hasil dari penjumlahannya adalah " + (bilBulat + bilPecahan));
    //pengurangan
    System.out.println("Hasil dari pengurangannya adalah " + (bilBulat - bilPecahan));
    //perkalian
    System.out.println("Hasil dari perkaliannya adalah " + (bilBulat * bilPecahan));
    //pembagian
    System.out.println("Hasil dari pembagiannya adalah " + (bilBulat / bilPecahan));
    //sisa bagi atau modulo
    System.out.println("Sisa dari hasil pembagiannya adalah " + (bilBulat % bilPecahan));

    //bagian boolean
    System.out.println("Sekarang kami akan menunjukan operasi boolean\nSilakan pilih satu antara \'True\' atau \'False\'");
    boolean pernyataan1 = input.nextBoolean();
    System.out.println("Sekarang pilih salah satu antara \'True\' atau \'False\' untuk dilakukan operasi dengan pernyataan sebelumnya");
    boolean pernyataan2 = input.nextBoolean();

    System.out.println("Apabila menggunakan operator AND akan menghasilkan nilai \'"+(pernyataan1 && pernyataan2)+"\'");
    System.out.println("Apabila menggunakan operator OR akan menghasilkan nilai \'"+(pernyataan1 || pernyataan2)+"\'");
    System.out.println("Apabila menggunakan operator XOR akan menghasilkan nilai \'"+(pernyataan1 ^ pernyataan2)+"\'");
    System.out.println("Apabila menggunakan operator NOT, pernyataan pertama akan menghasilkan \'"+(!pernyataan1)+"\'");
    System.out.println("Apabila menggunakan operator NOT, pernyataan kedua akan menghasilkan \'"+(!pernyataan2)+"\'");
    // +-*/%
  }
}
