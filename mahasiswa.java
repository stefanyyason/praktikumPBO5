/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author ASUS
 */
public class mahasiswa extends manusia{
    private double hasil;
    
    void dataMahasiswa (String NIM, String Fakultas, String Jurusan){
        System.out.println("Nim: "+NIM);
        System.out.println("Fakultas: "+Fakultas);
        System.out.println("Jurusan: "+Jurusan);
    }
    
    void nilaiMahasiswa(double Tugas1, double Tugas2, double Tugas3, double UTS, double UAS){
        hasil = ((Tugas1+Tugas2+Tugas3)/3)*0.4+UTS*0.3+UAS*0.3;
        System.out.println("Nilai Akhir: "+hasil);
    }
}
