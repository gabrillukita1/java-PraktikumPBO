
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
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukan Nama    : ");
        String nama = scanner.nextLine();
        System.out.print("Masukan NIM     : ");
        String nim = scanner.nextLine();
        System.out.print("Masukan Alamat  : ");
        String alamat = scanner.nextLine();
        System.out.print("Masukan UTS     : ");
        int uts = scanner.nextInt();
        System.out.print("Masukan UAS     : ");
        int uas = scanner.nextInt();
        
        Mahasiswa mahasiswa1 = new Mahasiswa(nama, nim, alamat, uts, uas);
        
        
        int menu = 0;
        do{
            System.out.println("\n\nMenu");
            System.out.println("1. Lihat Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            menu = scanner.nextInt();
            scanner.nextLine();
            
            switch(menu){
                case 1 : 
                    System.out.println("\n\nNama    : " + mahasiswa1.getNama());
                    System.out.println("NIM     : " + mahasiswa1.getNim());
                    System.out.println("Alamat  : " + mahasiswa1.getAlamat());
                    System.out.println("Nilai   : " + mahasiswa1.getNilai());
                    break;
                case 2 : 
                    System.out.println("\n\nEdit Data");
                    
                    System.out.print("\nMasukan Nama    : ");
                    nama = scanner.nextLine();
                    mahasiswa1.setNama(nama);
                    System.out.print("Masukan NIM     : ");
                    nim = scanner.nextLine();
                    mahasiswa1.setNim(nim);
                    System.out.print("Masukan Alamat  : ");
                    alamat = scanner.nextLine();
                    mahasiswa1.setAlamat(alamat);
                    System.out.print("Masukan UTS     : ");
                    uts = scanner.nextInt();
                    mahasiswa1.setUts(uts);
                    System.out.print("Masukan UAS     : ");
                    uas = scanner.nextInt();
                    mahasiswa1.setUas(uas);
                    break;
                case 3 :
                    break;
            }
        }while(menu != 3);
    }
}
