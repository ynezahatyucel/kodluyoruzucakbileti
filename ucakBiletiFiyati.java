package Giris;
import java.util.Scanner;

public class ucakBiletiFiyati {
    public static void main(String[] args) {
        int mesafe,yas,yolculuktipi;
        double toplamtutar,indirimlitutari,geneltoplam,birimfiyat=0.10;

        Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi 'km' olaak giriniz :");
        mesafe=input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz :");
        yas=input.nextInt();

        System.out.println("yolculuk tipini seçiniz.\nTek yön:1\nGidiş dönüş:2");
        yolculuktipi=input.nextInt();


        toplamtutar=mesafe*birimfiyat;

        switch (yolculuktipi){
            case 1:

        if (yas>0&&yas<12){
            indirimlitutari=(toplamtutar*0.5);
            geneltoplam=toplamtutar-indirimlitutari;
            System.out.println("Genel Toplam:"+geneltoplam);

        } else if (yas>12&&yas<24) {
            indirimlitutari=toplamtutar*0.1;
            geneltoplam=toplamtutar-indirimlitutari;
            System.out.println("Genel Toplam:"+geneltoplam);

        } else if (yas>65) {
            indirimlitutari=toplamtutar*0.3;
            geneltoplam=toplamtutar-indirimlitutari;
            System.out.println("Genel Toplam:"+geneltoplam);

        }
        else {
            indirimlitutari=toplamtutar;
            geneltoplam=toplamtutar;
            System.out.println("Genel Toplam:"+geneltoplam);}
        break;
            case 2:
        if (yas>0&&yas<12){
        indirimlitutari=toplamtutar*0.7;
            geneltoplam=toplamtutar-indirimlitutari;
            System.out.println("Genel Toplam:"+geneltoplam*2);

        } else if (yas>12&&yas<24) {
            indirimlitutari=toplamtutar*0.3;
            geneltoplam=toplamtutar-indirimlitutari;
            System.out.println("Genel Toplam:"+geneltoplam*2);
        } else if (yas>65) {
            indirimlitutari=toplamtutar*0.5;
            geneltoplam=toplamtutar-indirimlitutari;
            System.out.println("Genel Toplam:"+geneltoplam*2);
        } else {
            indirimlitutari=toplamtutar;
            geneltoplam=toplamtutar;
            System.out.println("Genel Toplam:"+geneltoplam*2);}
        break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");


    }
}}
