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
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        
        System.out.println("isi variable z : " + z);
        System.out.println("isi x sama dengan z  (Case Sensitive): " + x.equals(z));
        
        String r = "Operasi ";
        System.out.println("isi variable r : " + r);
        System.out.println("isi x sama dengan r (Case Sensitive) : " + x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive) : " + x.equalsIgnoreCase(r));
    }    
}
