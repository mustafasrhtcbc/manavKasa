import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double Armut=2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlıcan=5.00,toplam;
        int miktar;

        Scanner imp=new Scanner(System.in);

        System.out.print("Armut kaç kg olacak?");
        miktar=imp.nextInt();
        toplam=miktar*Armut;
        System.out.print("Elma kaç kg olacak?");
        miktar=imp.nextInt();
        toplam+=miktar*Elma;
        System.out.print("Domates kaç kg olacak?");
        miktar=imp.nextInt();
        toplam+=miktar*Domates;
        System.out.print("Muz kaç kg olacak?");
        miktar=imp.nextInt();
        toplam+=miktar*Muz;
        System.out.print("Patlıcan kaç kg olacak?");
        miktar=imp.nextInt();
        toplam+=miktar*Patlıcan;
        System.out.print("Aldığınız ürünlerin toplam fiyatı--->>>"+toplam);
        imp.close();

    }
}
