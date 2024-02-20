import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy;
//Kilo Girişi
        Scanner inp = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz: ");
        kilo = inp.nextInt();

//Boy Girişi
        System.out.print("Boyunuzu Metre Cinsinden Giriniz: ");
        boy = inp.nextDouble();

//indeks
        double indeks = (kilo /(boy * boy));
        System.out.print("Vücut Kitle Endeksiniz: " + indeks);
    }
    }