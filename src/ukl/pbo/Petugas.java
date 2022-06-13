package ukl.pbo;

import java.util.ArrayList;
    
    public class Petugas implements User {

    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Petugas() { //set nama petugas dan memasukkan ke dalam arraylist
        this.namaKaryawan.add("Doni");
        this.alamat.add("Malang");
        this.telepon.add("081111222333");}

    public int getJmlPetugas() {
        return this.namaKaryawan.size();} //mengembalikan jumlah total petugas perpus
    
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);} //merubah nama karyawan

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);} //merubah alamat karyawan

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);} //merubah nomor telepon

    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);} //memngemablikan nilai nama karyawam

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan); } //mengembalikan alamat karyawan

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);} //Mengembalikan nilai nomor telepon karyawan
    
}
/*
polimor dinamis yaitu yang methodnya sama dengan implements
jika ingin mengakses class lain memakai method
override adalah ingin mengakses data dengan menggunakan set get
pengertian ovveride sendiri yaitu ingin mengakses data kembali yang ada di user
*/
