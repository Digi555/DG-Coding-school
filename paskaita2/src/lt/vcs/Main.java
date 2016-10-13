package lt.vcs;

import java.util.Scanner;

public class Main {

    /**
     * musu pasisveikinimo klase
     * kaip greitai keiciasi
     * @param args
     */
    public static void main(String[] args) {
//	    int kint = getLuckyNumber(555);
//        System.out.println(kint);
        Scanner input = new Scanner( System.in );{
            System.out.println ("iveskite zodi :");
            String zodis = input.next();
                if (zodis.equals("pabaiga")) {
                    System.out.println("viso gero");}
                else
                {
                    System.out.println("neteisingas zodis");
                }}
    }

    public static int getLuckyNumber (int metodoParam){
    System.out.println (metodoParam);
        return 123;
    }
    public static void pabaiga(String[] args) {
        
   }
}
