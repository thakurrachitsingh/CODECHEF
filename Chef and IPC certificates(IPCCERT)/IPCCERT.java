//Question-- https://www.codechef.com/problems/IPCCERT


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		for(int i=0;i<n;i++){
		    int x = 0;
		    int sum = 0;
		    for(int j=0;j<(k+1);j++){
		        x = sc.nextInt();
		        if(j<k){
		            sum = sum + x;
		        }
		    }
		    if(sum>=m && x<=10){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
