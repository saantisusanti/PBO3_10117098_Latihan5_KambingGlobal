/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan5_kambingglobal;

/**
 *
 * @author 
 * NAMA  : Santi Susanti
 * KELAS : PBO3
 * NIM   : 10117098
 */
public class KambingGlobal {
    //variabel jumlahkambing menjadi variabel instance
      
     int jumlahKambing = 88;
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: " +jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +jumlahKambing);
        
    }
}
