package ForLoop;

import java.util.Arrays;
import java.util.Scanner;

public class HW076 {

	public static void main(String[] args) {
		
		  
	
		    Scanner input=new Scanner(System.in);
		    System.out.println("Please enter days of the week starting with Sunday");
		    int days=input.nextInt();
		    String [] array= new String[days];
		    for (int i=0; i<array.length; i++){
		   array[i]=input.next();
		      System.out.println(array[i]);

		    }
		  input.close();
		    }
}
