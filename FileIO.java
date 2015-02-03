	import java.util.Scanner;
	import java.io.*;	
	import java.util.Random;
	  
	public class FileIO {
	   	     
	    public static void main(String[] args) {
	         
	        try {          
	            PrintWriter p = new PrintWriter("MichaelGatesArray.txt");
	          
	            for(int i=0;i<100;i++){
	                Random r = new Random();
	                int number = r.nextInt(100);
	                p.print(" " + number);
	                 
	                 
	            }
	           
	            p.close();     
	 
	           
	 
	        } catch(Exception ex){
	            System.out.println("Error accessing file.");
	            System.out.println("Reason was: "+ex.getMessage());
	            ex.printStackTrace();
	        }
	    }
	}
