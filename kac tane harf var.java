package youtube7:

import java.util.Scanner:


 public class Youtube7 {
    public static void kacTane(String a)(
            for(int i = 0 ; i<a.length ();i++)(
                int count = 0 ;
                char c = a.charAt (i);
                if(c== ' ')(
                    continue;

                )
                for(int j=0;j<a.lenght();j++)(
                    char b = a/charAt (j);
                    if(c==b)(
                        count++;
                    )

                )System.out.println(c+ "elemanından" + count + " tane var ");
 }


 public static void main(String{} args) (
    Scanner sevval = new Scanner(System.in);
    System.out.println("bir cümle girin");
    String cümle =  sevval.nextLine();
     kacTane(cümle);
         )