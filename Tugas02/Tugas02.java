/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas02;

/**
 *
 * @author Brillian Dzaka Mahatva Yoda
 */
import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilih,batas;
        
        System.out.println("Mengetahui Deret Bilangan");
        System.out.println("1.Ganjil    2.Genap");
        System.out.print("Tentukan Pilihan (Ganjil/Genap) : ");
        pilih = input.nextInt();
        
        
        
        switch (pilih){
            case 1 : 
                    System.out.println("================================");
                    System.out.print("Masukan Batas Bilangan (MAX 500): ");
                    batas = input.nextInt();
                    System.out.println("Deret Bilangan Ganjil");
                    for(int i=1;i<=batas;i++){
                        if (i%2!=0){
                        System.out.println(i+" ");
                        }
                        else if (i>=501){
                            System.out.println("Sudah Melebihi Angka 500");
                            break;                            
                        }
                    } 
                    break;
            case 2 : 
                    System.out.println("================================");
                    System.out.print("Masukan Batas Bilangan (MAX 500): ");
                    batas = input.nextInt();
                    System.out.println("Deret Bilangan Genap");
                    for(int i=1;i<=batas;i++){
                        if (i%2==0){
                        System.out.println(i+" ");
                        }
                        else if (i>=500){
                            System.out.println("Sudah Melebihi Angka 500");
                            break;
                        }
                    }
                    break;
            default : System.out.println("Pilihan Tidak Ada");
        }
    }
}