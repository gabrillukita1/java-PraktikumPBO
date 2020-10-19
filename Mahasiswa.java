
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String alamat;
    private int uts;
    private int uas;
    
    public Mahasiswa(String nama, String nim, String alamat, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.uts = uts;
        this.uas = uas;
    }
    
//    private int hitungNilai(int a, int b){
//        return a*b/2;
//    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setUts(int uts){
        this.uts = uts;
    }
    
    public void setUas(int uas){
        this.uas = uas;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public int getNilai(){
        return (uas+uts)/2;
    }
    
    public int getUas(){
        return uas;
    }
}
