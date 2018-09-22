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
public class PBO3_10117098_Latihan5_KambingGlobal {

    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
         kambingSusu.getJumlahKambing();
         
        //menambah satu kambing
         kambingSusu.tambahKambing();
         
         //menampilkan jumlah kambing yang ada
         kambingSusu.getJumlahKambing();
    }
    
}
