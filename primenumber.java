/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int temp;
		boolean prime=true;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
	    for(int i=2;i<=num/2;i++)
	    {
	    	temp=num%i;
	    	if(temp==0)
	    	{
	    		prime=false;
	    		break;
	    	}
	    }
	    if(prime)
	    
	      System.out.println("yes");
	      else
	      System.out.println("no");
	    	}
	    }
	
