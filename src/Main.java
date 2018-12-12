import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sk1=0, sk2=0;       // inicializuoti kintam1jį su konkrečia reikšme, kad būtų patogiau valdyti. Jei reikšme nepriskiriama, gali buti atveju kai nenumatysime situaciju kada kintamasis yra be reikšmes.
        char A = 'T';
        String operation;         //operz - operacijos ženklas
        Scanner S = new Scanner(System.in);

        pradzia();
        while (A == 'T') {
            sk1 = ivestiDemeni();

            sout("Iveskite operacijos ženkla");
            operation = S.nextLine();

            if (operation.equals("/") || operation.equals("*") || operation.equals("-") || operation.equals("+")) {
                sk2 = ivestiDemeni();
            } else if (operation.equals("!")){
                sout("Skaičiuojamas faktorialas");
            } else {
               sout("Ivestas neteisingas operacijos ženklas");
            }
            sout("Atsakymas:");

            if (operation.equals("*")) {
                double sandauga = sudauginti(sk1, sk2);
                sout(sk1 + " * " + sk2 + " = " + sandauga);
            } else if (operation.equals("/")) {
               dalinti(sk1, sk2);
            } else if (operation.equals("+")) {
                double suma = sk1 + sk2;
                sout(sk1 + " + " + sk2 + " = " + suma);
            } else if (operation.equals("-")) {
                double skirtumas = sk1 - sk2;
                sout(sk1 + " - " + sk2 + " = " + skirtumas);
            } else if (operation.equals("!")) {
                double faktorialas = skaiciuotiFaktoriala(sk1);
                sout(sk1 + "!" + " = " + faktorialas);
            } else {
                sout("Operacija negalima");
            }

            sout("Ar testi vykdyma? T/N");
            A = S.next().charAt(0);
            A = Character.toUpperCase(A);
        }
        sout("Programa baige darba");
    }
    //grąžinanti su parametrais
    public static double sudauginti(double sk1, double sk2) {
        double sandauga = sk1 * sk2;

        return sandauga;
    }
    //grąžinanti su parametrais
    public static double skaiciuotiFaktoriala(double sk1) {
        long factorial = 1;
        for(int i = 1; i <= sk1; ++i){
            factorial *= i; //faktorialas = faktorialas * i;
        }
           return factorial;
    }
    //grąžinanti be parametų
    public static double ivestiDemeni() {
        sout("Iveskite skaiciu");
        Scanner S = new Scanner(System.in);
        return S.nextDouble();
    }
    //negrąžinanti su parametrais
    public static void dalinti(double sk1, double sk2) {//bloga praktika, nes funkcija turi atlikti vieną veiksmą
        if (sk2 != 0) {
            double dalmuo = sk1 / sk2;
            System.out.println(sk1 + " / " + sk2 + " = " + dalmuo);
        } else {
            System.out.println("Dalyba iš 0 negalima");
        }
    }
    //negrąžinanti su parametrais
    public static void sout(String eilute){
        System.out.println(eilute);
    }

    //negrąžinanti be parametrų
    public static void pradzia() {
        sout("Genialios programerės Anos Taurienės skaičiuotuvas");
    }
}
