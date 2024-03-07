package examples.BiggerInt;

import java.math.BigDecimal;
import java.util.*;
class bigDecimal{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        BigDecimal[] x = new BigDecimal[n+2];
        for(int i=0;i<n;i++)
        {

            x[i] = new BigDecimal(s[i]);
            System.out.println(x);
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}