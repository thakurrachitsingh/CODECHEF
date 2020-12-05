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
		float t = sc.nextInt();
		for(int i=0;i<t;i++){
		    float n = sc.nextInt();
		    float d = sc.nextInt();
		    float a = 0;
		    double danger = 0;
		    double safe = 0;
		    for(int j=0;j<n;j++){
		        a = sc.nextInt();
		        if(a>=80 || a<=9){
		            danger++;
		        }else{
		            safe++;
		        }
		    }
		    danger = Math.ceil(danger/d);
		    safe = Math.ceil(safe/d);
		    System.out.println((int)danger+(int)safe);
		}
	}
}
