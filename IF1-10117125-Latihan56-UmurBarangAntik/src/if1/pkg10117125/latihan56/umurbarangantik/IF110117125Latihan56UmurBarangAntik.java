/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan56.umurbarangantik;

/**
 *Nama  : Zulfi Ihzam Rahmat
 *Kelas : IF-1
 *NIM   : 10117125
 *Deskripsi Program : program ini berisi program yang menampilkan umur suatu
 *                    barang antik
 */
public class IF110117125Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama Barang Antik : "+radio.getName());
        radio.tampilUmur();
    }
    
}
