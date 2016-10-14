package lt.vcs;

import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static int i;

    /**
     * musu pasisveikinimo klase
     * kaip greitai keiciasi
     * @param args
     */

    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner( System.in );{
            System.out.println ("iveskite zodi:");
            String zodis = input.next();

            System.out.println(zodis.length());
            System.out.println ("surasti raide:");
            char ch = (char)System.in.read();

            int KiekKartu = 0;
            for(int i=0; i<zodis.length();i++);{

                char c=zodis.charAt(i);
                if(c==ch){
                    KiekKartu++;
                }
            }
            System.out.print("Zodyje raidziu: ");
            System.out.println(KiekKartu);

                }
            }
    }


    //public static void zodis(String[] args) {
//	    int kint = getLuckyNumber(555);
//        System.out.println(kint);
       // Scanner input = new Scanner( System.in );{
         //   System.out.println ("iveskite zodi :");
            //String zodis = input.next();
                //if (zodis.equals("pabaiga")) {
                //    System.out.println("viso gero");}
               // else
             //   {
            //        System.out.println("neteisingas zodis");
             //   }}
   // }

    //public static int getLuckyNumber (int metodoParam){
  //  System.out.println (metodoParam);
  //      return 123;
  //  }
 //   public static void pabaiga(String[] args) {

 //  }
//}
