//  Java Loops II


//  HackerRank Problem Solved using Java.


import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s,c=1;
            s=a+c*b;
            for(int j=0;j<n;j++)
            {
                System.out.print(s+" ");
                c=c*2;
                s=s+c*b;
            }
            System.out.println();
        }
        
        in.close();
    }
}
