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
		float d1 = sc.nextInt();
		float v1 = sc.nextInt();
		float d2 = sc.nextInt();
		float v2 = sc.nextInt();
		float p = sc.nextInt();
		float min = d1;
		float max = d2;
		float V1 = v1;
		float V2 = v2;
		if(min>d2){
		    min = d2;
		    max = d1;
		    V1 = v2;
		    V2 = v1;
		}
		float count = (max - min)*V1;
		if(count>=p){
		    count = p/V1;
		    System.out.println((int)count+(int)min-1);
		}else{
		float pLeft = p-count;
		double lastRecord = Math.ceil(pLeft/(V1+V2));
		System.out.println((int)(max-min)+(int)lastRecord+(int)min-1);}
	}
}
