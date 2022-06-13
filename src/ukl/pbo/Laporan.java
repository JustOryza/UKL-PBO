package ukl.pbo;

public class Laporan {
    public void laporan(Buku buku) {
        int x = buku.getJmlBuku();

        System.out.println();
        System.out.println("========== Tabel Buku ==========");
        System.out.println();
        System.out.println("Kode \tNama Buku \tStok \tHarga Pinjam/hari");
        for (int i = 0; i < x; i++) {
            System.out.println(i + "\t" +
                    buku.getNamaBuku(i) + "\t" + 
                    buku.getStok(i) + "\t" + 
                    buku.getHarga(i));
        }
    }
    
    public void laporan(Siswa siswa) {
        int x = siswa.getJmlSiswa();

        System.out.println();
        System.out.println("========== Tabel Siswa ==========");
        System.out.println();
        System.out.println("id \tNama \tAlamat \tTelepon \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println( i + "\t" +
                    siswa.getNama(i) + "\t" +
                    siswa.getAlamat(i) + "\t" + 
                    siswa.getTelepon(i) + "\t" +
                    siswa.getStatus(i));
        }
    }
    
    public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();

        System.out.println();
        System.out.println("========== Tabel Petugas ==========");
        System.out.println();
        System.out.println("id \tNama \tAlamat \tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println( i + "\t" +
                    petugas.getNama(i) + "\t" +
                    petugas.getAlamat(i) + "\t" + 
                    petugas.getTelepon(i));
        }
    }
    
    public void laporan(Peminjaman peminjaman, Buku buku) {
        int x = peminjaman.getJmlPeminjaman();
        
        System.out.println();
        System.out.println("========== Laporan Peminjaman ==========");
        System.out.println();
        System.out.println("Id siswa \tNama Buku \tQty \tHarga Pinjam/hari \tJumlah");
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = peminjaman.getBanyaknya(i) * buku.getHarga(peminjaman.getIdBuku(i));
            total += jumlah;
            System.out.println(peminjaman.getIdSiswa(i) + "\t\t" + buku.getNamaBuku(peminjaman.getIdBuku(i)) + "\t" +
                    peminjaman.getBanyaknya(i) + "\t\t" + 
                    buku.getHarga(peminjaman.getIdBuku(i)) + "\t\t" +
                    jumlah);
        }
        System.out.println("Total omset peminjaman = " + total);
    }

}
