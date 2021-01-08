/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatasederhana;

/**
 *
 * @author MOKLET-2
 */
public class BiodataSederhana {
//mendeklarasikan variabel
String Nama;
int NIS;
String ttl;
String jeniskelamin;
String alamat;
String agama;
String motto;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek baru
        BiodataSederhana biodata = new BiodataSederhana();
        
        //mengimplementasikan variabel
        biodata.Nama = "Lathifa Puteri Asy'ari";
        biodata.NIS = 6503;
        biodata.ttl = "Sidoarjo, 20-Juni-2005";
        biodata.jeniskelamin = "Perempuan";
        biodata.alamat = "Perumahan Tambak Yudan Makmur Blok i 53, kota Pasuruan";
        biodata.agama = "Islam";
        biodata.motto = "kegagalan adalah kesuksesan yang tertunda";
        
        //menampilkan hasil
        System.out.println("Nama = "+biodata.Nama);
        System.out.println("NIS = "+biodata.NIS);
        System.out.println("Tempat Tanggal Lahir = "+biodata.ttl);
        System.out.println("Alamat = "+biodata.alamat);
        System.out.println("Jenis Kelamin = "+biodata.jeniskelamin);
        System.out.println("Agama = "+biodata.agama);
        System.out.println("Motto Kehidupan = "+biodata.motto);
    }
    
}
