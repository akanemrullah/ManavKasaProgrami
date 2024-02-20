import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Gerekli degisken tanimlamalari gerceklestirildi.
        double armut, elma, domates, muz, patlican, armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = .95, patlicanFiyat = 5, total;

        // Scanner nesnemiz projemize dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan bazi veriler alinip bu veriler ilgili degiskenlere atandi.
        System.out.print("Armut Kaç Kilo ? :");
        armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = input.nextDouble();

        // Toplam fiyat hesaplamasi yapilip bu fiyat bilgisi kullaniciya iletildi.
        total = armut * armutFiyat + elma * elmaFiyat + domates * domatesFiyat + muz * muzFiyat + patlican * patlicanFiyat;
        System.out.print("Toplam Tutar : " + total + " TL");
    }
}