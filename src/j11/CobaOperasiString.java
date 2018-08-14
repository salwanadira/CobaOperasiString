/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11;
import java.util.Locale;
public class CobaOperasiString {
    public static void main(String[] args)
    {
        String identitas = "Salwa Nadira Adzani / X RPL 3 / 34";
        System.out.println("Identitas: " + identitas);
        
        System.out.println(" ");
        
        String x = "Operasi";
        System.out.println("Isi variabel x : " + x);
        System.out.println("\"" + x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi variabel y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
    }    
}
