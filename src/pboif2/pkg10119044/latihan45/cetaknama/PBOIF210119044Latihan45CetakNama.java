/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan mencetak nama berdasarkan input user
 */

public class PBOIF210119044Latihan45CetakNama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Printer objPrinter = new Printer();
        System.out.print("Masukkan nama anda : ");
        objPrinter.setNama(input.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        objPrinter.setJmlCetak(input.nextInt());

        objPrinter.cetak(objPrinter.getNama());
        objPrinter.cetak(objPrinter.getJmlCetak(), objPrinter.getNama());
    }
}
