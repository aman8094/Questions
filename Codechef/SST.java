/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    try {
	        
	        Scanner scan = new Scanner(System.in);
	        
	        int T = scan.nextInt();
	        
	        while(T>0){
	            
	            
	            int A = scan.nextInt();
	            int B = scan.nextInt();
	            
	            int C = A*100/10;
	            int D = B*100/20;
	            
	            
	            if(C==D){
	                
	                System.out.println("ANY");
	                
	            }
	            else if(C>D){
	                System.out.println("FIRST");
	            }
	            else{
	                System.out.println("SECOND");
	            }
	            
	            
	            
	            
	            
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    } catch(Exception e) {
	    }
	}
}
