package Giris;
import java.util.Scanner;
public class OdevDaire {
    public static void main(String[] args) {
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
               // Formül : (𝜋 * (r*r) * 𝛼) / 360
        Scanner input=new Scanner(System.in);
        double pisayisi=3.14;
        int r,a;
        System.out.print("r giriniz: ");
        r=input.nextInt();
        System.out.print("a giriniz: ");
        a=input.nextInt();
        double alan= (pisayisi*(r*r)*a)/360;
        System.out.print("alan : " + alan + "derecedir");












    }



}
