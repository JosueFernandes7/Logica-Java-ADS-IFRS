import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int quadrado=0,cubo=0;
        int j = 1;

        while (j <= num){
            quadrado = j*j;
            cubo = quadrado*j;
            System.out.println(j+" "+quadrado+" "+cubo);
            System.out.println(j+" "+(quadrado+1)+" "+(cubo+1));

            j++;
        } 

    }
 
}