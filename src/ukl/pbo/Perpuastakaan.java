package ukl.pbo;

import java.util.Scanner;
public class Perpuastakaan {

 public static void main(String[] args) {
        System.out.println("<<< Selamat Datang di Perpustakaan >>>");
        Scanner scan = new Scanner(System.in);
        
        Siswa siswa = new Siswa(); //membuat objek baru
        Petugas petugas = new Petugas();
        Buku buku = new Buku();
        Peminjaman peminjaman = new Peminjaman();
        Laporan laporan = new Laporan();
        
            
        int jawab;
        do { //
            laporan.laporan(petugas); //menampilkan status atau informasi petugas
            laporan.laporan(siswa); //menampilkan status dan iformasi dari siswa
            laporan.laporan(buku);
            laporan.laporan(peminjaman, buku);
            
            peminjaman.prosesPeminjaman(siswa, peminjaman, buku, laporan);
            laporan.laporan(siswa);
            laporan.laporan(buku);
            laporan.laporan(peminjaman, buku);
            
            System.out.println("");
            System.out.println("Lanjutkan ---> 1");
            System.out.println("Matikan -----> 2");
            System.out.print("Lanjutkan atau matikan? [1 / 2] : ");
            jawab = scan.nextInt();
        } while (jawab == 1);
    } 
}
