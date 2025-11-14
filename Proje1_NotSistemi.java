AD SAYOD: MEHMET ALİ KIRAÇÇAKALI
NUMARA: 250541069
TRAİH: 14.11.2025




import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;
public class nothesaplama {
    static Scanner input = new Scanner(System.in);
    static double vize;
    static double finalnot;
    static double ödevnot;
    static double notunuz;
    static char harfnot;
    static String durum;
    static String onur;

    public static void main(String[] args) {
        hesap();
        başariHesap();
        harfnot();
        onurliste();
        çikti();
    }
    public static double hesap(){
    System.out.print("Vize notunuzu giriniz: ");
    vize = input.nextDouble();
    System.out.println("=============================");
    System.out.print("Final notunuzu giriniz: ");
    finalnot = input.nextDouble();
    System.out.println("=============================");
    System.out.print("Ödev notunuzu giriniz: ");
    ödevnot = input.nextDouble();
    System.out.println("=============================");




    //hesaplama
    notunuz = vize*0.3+finalnot*0.4+ödevnot*0.3;
    return notunuz;

    }
    //DURUM BİLGİ METODU
    public static String başariHesap(){
    if(notunuz>=50){
        durum ="GEÇTİNİZ";
        
    }else if(notunuz<50 && notunuz>=40){
        durum = "BÜTÜNLÜME SINAVINA KALDINIZ";
    }else{
        durum = "KALDINIZ";
    }
    return durum;

    }
    //HARF NOT METODU
    public static char harfnot(){

        if(notunuz<100 && notunuz>=90){
            harfnot = 'A';
            
        }else if(notunuz<90 && notunuz>=80){
            harfnot = 'B';
        }else if(notunuz<80 && notunuz>=70){
            harfnot = 'C';
        }else if(notunuz<70 && notunuz >=60){
            harfnot = 'D';
        }else{
            harfnot = 'F';
        }
        return harfnot;

    }
    //ONUR LİSTE KONTROL
    public static String onurliste(){
        if(notunuz>=85 && vize>=70 && finalnot>=70 && ödevnot>=70){
            onur="EVET";
        }else{
            onur="HAYIR";
        }
        return onur;
    }
    //ÇIKTILAR
    public static void çikti(){
    System.out.println("==============================");
    System.out.println("    ==ÖRENCİ NOT RAPORU==");    
    System.out.println("VİZE: "+vize);
    System.out.println("FİNAL: "+finalnot);
    System.out.println("ÖDEV: "+ödevnot);
    System.out.println("*-------------------------------*");
    System.out.println("ORTALAMA: "+notunuz);
    System.out.println("HAFR NOTUNUZ: "+harfnot);
    System.out.println("DURUMUNUZ: "+durum);    
    System.out.println("ONUR LİSTESİ: "+onur);
        input.close();
    }
}

