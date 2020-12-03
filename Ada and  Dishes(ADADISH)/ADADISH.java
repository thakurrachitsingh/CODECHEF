//Question-- https://www.codechef.com/problems/ADADISH


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    ArrayList<Integer> list = new ArrayList<>();
		    for(int j=0;j<n;j++){
		        list.add(sc.nextInt());
		    }
		    Collections.sort(list);
		    int x = (n-1);
		    int burner1 = 0;
		    int burner2= 0;
		    while(x>=0){
		        if(burner1<=burner2){
		        burner1 = burner1 + list.get(x);
		        x--;
		        }else if(burner2<=burner1){
		            burner2 = burner2 + list.get(x);
		            x--;
		        }
		        
		    }
		    if(burner1<burner2){
		        System.out.println(burner2);
		    }else if(burner1 > burner2){
		        System.out.println(burner1);
		    }else{
		        System.out.println(burner1);
		    }
		}
	}
}
