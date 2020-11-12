/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan45.cetaknama;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan mencetak nama berdasarkan input user
 */

class Printer {
    private int jmlCetak;
    private String nama;
    

    
    public int getJmlCetak(){
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.print("Nama anda : "+getNama()+"\n");      
    }
    
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak : ");
        int i;
        for (i=1; i<=jmlCetak; i++){
            System.out.println(i+". "+nama);
        }
    }
}
