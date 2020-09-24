// Program ini untuk menghitung jumlah penumpang
// yang tertera pada soal
// program untuk menghitung secara otomatis ada di
// Modul3Soal2_1
class Modul3Soal2 {
  public static void main(String[] args) {
    //hitung jumlah uang saku
    int uangSaku = 2500000;
    int pengeluaran = 100000 + 85000 + 101000 + 120000 + 50000 + 75000;
    int sisaUang = uangSaku - pengeluaran;

    //output hasil perhitungan sisa uang saku
    System.out.println(sisaUang);
  }
}
