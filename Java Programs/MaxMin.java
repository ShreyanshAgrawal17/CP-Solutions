package lab1;

import java.util.Scanner;

public class q2 {
    	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int i,max=0,min=0,n;
         System.out.println("Enter number: 1");
         n=sc.nextInt();
         min=n;
         for(i=2;i<=5;i++)
         {
        	 System.out.println("Enter number: "+i);
        	 n=sc.nextInt();
        	 max=n;
        	 if(n>max)
        	 {
        		 max=n;
        	 }
        	 if(n<min)
        	 {
        		 min=n;
        	 }
         }
         System.out.println("Max is: "+max);
         System.out.println("Min is: "+min);
         sc.close();
	}
}
