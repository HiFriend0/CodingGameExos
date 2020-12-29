import java.util.Arrays;
import java.util.Scanner;

/***
 * https://www.codingame.com/ide/puzzle/temperature-code-golf
 */

public class Temperatures {

        public static void main(String args[]) {
           // int tab[]=readElementsInput () ;

            int tab[] = {1,-2,-8,4,5};
            solution (tab) ;

        }

        public static void solution (int [] tab){

            if (tab.length==0 || tab == null)   System.out.println("0");

            else {
                    Arrays.sort(tab);
                    int min = tab[0];
                    for (int i=1 ; i<tab.length ; i++){
                        if ( Math.abs(tab[i]) <= Math.abs(min) ) min = tab[i];
                    }
                    System.out.println(min);
                }
        }

    /**
     *     This code is already given in coding game exercice
      */
    public static int[] readElementsInput () {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int tab[]= new int [n];

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            tab [i]=t ;
        }
        return tab ;

    }

}



