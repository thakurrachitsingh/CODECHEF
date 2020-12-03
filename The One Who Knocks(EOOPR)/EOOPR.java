//Question-- https://www.codechef.com/problems/EOOPR



/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x<y && (y-x)%2!=0){
		        System.out.println(1);
		    }else if(x<y && (y-x)%2==0 && ((y-x)/2)%2==0){
		        System.out.println(3);
		    }else if(x<y && (x-y)%2==0 && ((x-y)/2)%2!=0){
		        System.out.println(2);
		    }else if(x>y && (x-y)%2==0){
		        System.out.println(1);
		    }else if(x>y && (x-y)%2!=0){
		        System.out.println(2);
		    }else if(x==y){
		        System.out.println(0);
		    }
		}
		sc.close();
	}
}
