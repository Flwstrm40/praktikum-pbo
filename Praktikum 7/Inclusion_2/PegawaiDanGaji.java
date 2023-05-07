/**
 * File  : PegawaiDanGaji.java   03/05/2023
 * Penulis  : Muhammad Naufal Arkan/24060121130073
 * Deskripsi  : program Main PegawaiDanGaji
 */

public class PegawaiDanGaji{
    public static void main(String args[]) { 
    Pegawai pegawai = new Programmer("Mira");
    Pegawai pegawai2 = new Manajer("Joko");
    Pegawai pegawai3 = new Manajer("Argo");

    Payroll payroll = new Payroll();
    payroll.cetakGaji(pegawai);
    payroll.cetakGaji(pegawai2); 
    payroll.cetakGaji(pegawai3);
    }
}

