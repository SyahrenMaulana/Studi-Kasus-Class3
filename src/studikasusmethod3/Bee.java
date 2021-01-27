/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusmethod3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bee {
    static void yoi(){
        Scanner kode = new Scanner (System.in);
        System.out.println("masukan nama peminjam :");
        String nama = kode.next();
        System.out.println("masukan kode = ");
        int angka = kode.nextInt();
        if (angka==1){
            System.out.println("Laskar Pelangi");
            System.out.println("Andrea Hirata");
            System.out.println("Gramedia");
        }else if(angka==2){
            System.out.println("Avatar");
            System.out.println("Hiroku");
            System.out.println("Maxindo");
        }else if(angka==3){
            System.out.println("Kambing jantan");
            System.out.println("Raditya Dika");
            System.out.println("Gramedia");
        }else if(angka==4){
            System.out.println("Gus Dur");
            System.out.println("Greg Barton");
            System.out.println("LKIS");
            
        }
        System.out.println();
        System.out.println("Lama peminjaman = ");
        int lama = kode.nextInt();
        if (lama==1){
            System.out.println("Biaya Peminjaman = Rp.1000");
        }else if (lama<=3){
            System.out.println("Biaya peminjaman = Rp.5000");
        }else {
            System.out.println("Biaya peminjaman = Rp.10000");
        }

    }
    
}
