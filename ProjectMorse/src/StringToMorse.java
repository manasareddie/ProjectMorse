import java.util.Scanner;
//Creating StringToMorse class which converts a english text to morse code
public class StringToMorse {
	public static void main(String[] args) {//main class
		//creating scanner object to scan user input
		 Scanner in = new Scanner(System.in);
		 //creating string array which can store all alphabet and numbers.
		    String [] alphabet ={" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
		 //creating string array which stores morse code for corresponding alphabet and number present in alphabet array
		 //space is take as "|" in morse code
		    String [] morse = {" ",".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};		   
		 //creating an input variable to store input given by the user
		    String input=null;	
		 //
		    do{
		 //promt the user to enter text
		    System.out.println( "Enter the text to convert to Morse Code: ");
		    input = in.nextLine();
		 //creating and declaring output variable
		    String output="";
		 //if condition if input has alphabet,numbers and spaces
		    if(input.matches("[a-zA-Z0-9 ]*"))
		    {
		 //for loop to iterate through the input string   	
		    for(int i=0;i<input.length();i++)
		    {
		 //for loop to find corresponding morse code		
		    	for(int j=0;j<alphabet.length;j++)
		    	{
		    		if(input.toLowerCase().charAt(i)== alphabet[j].charAt(0))
		    				{
		    			//ouput morse code where each word is separated by " "
		    					output =output+morse[j];
		    				}		    		
		    	}
		    }
		    System.out.println(output);
		    }
		    //else condition when input has special characters like +-/* etc
		    else
		    {
		    	System.out.println("please enter text without special characters");
		    }
		    }while(!input.isEmpty());
		    //closing the scanner object
		    in.close();
		       
	}	   
}
//sample input: Russell Investments
//output for above input:.-...-........-...-.. ..-....-....---.-.-...
