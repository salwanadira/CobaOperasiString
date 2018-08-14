/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11;
import java.util.Scanner;
public class ConvertVocal2Angka {
    public static void tampilJudul(String identitas)
    {
        System.out.println("Identitas :" + identitas);
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
        
    }  
    private static String tampilInput() 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalmat: ");
        String kalimat = scanner.nextLine();
        
        System.out.println("Kalimat Asli : " + kalimat);
        return kalimat;
    }
    public static void main(String[] args)
    {
        String identitas = "Salwa Nadira Adzani / X RPL 3 / 34";
        tampilJudul(identitas);
        
        String kalimat = tampilInput();
    }
                 
}   
    
    