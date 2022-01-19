import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        //1
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter full name:");
        String inputtedName = input.nextLine();
        System.out.print(Character.toUpperCase( inputtedName.charAt(0)));
        for (int i = 1; i < inputtedName.length() - 1; i++) 
        {
            if (inputtedName.charAt(i) == ' ') 
            {
             
               System.out.print(Character.toUpperCase( inputtedName.charAt(i + 1))); 
            }
            if (inputtedName.charAt(i) == '-') 
            {
             
               System.out.print(Character.toUpperCase( inputtedName.charAt(i + 1))); 
            }
        }    
        // This code gives out the initials of the person according to the name entered it also recognises hyphenated last names. For this it uses multiple if statements to look into  the start of every word in the inputted String.
        //2 
        System.out.println("Enter the String which is to be reversed:");
        String toBeReversed = input.nextLine();
        String reversed = "";
        for(int i = toBeReversed.length() - 1; i >= 0 ; i--)
        {
            reversed += toBeReversed.charAt(i);
            
        }
        System.out.println(reversed);
        
        //This code reverses the string that is input. For this it uses a singe for loop which adds characyers to a previously declared empty strinh.
        //4
        System.out.println("Enter the String in which the vowels are to be removed:");
        String inputtedString  = input.nextLine();
		inputtedString = inputtedString.replaceAll("[AaEeIiOoUu]", "");
		String result = inputtedString.substring(0 , 1);
		for(int i = 1 ; i < inputtedString.length(); i++)
		{
		    if(inputtedString.substring(i , i + 1).equals("y")||inputtedString.substring(i , i + 1).equals("Y"))
		    
		    {
		        if(inputtedString.substring(i - 1 , i ).equals(" "))
		        {
		            result += inputtedString.substring(i - 1 , i);
		        }
		        else
		        {
		            result += "";
		        }
		    }
		    else
		    {
		        result += inputtedString.substring(i , i + 1);
		    }
		}
		System.out.println(result);
		// This code deletes all the vowels and the y's (unless its at the start of a word) from the string that is inputted. For this it uses a replace All command.
		
		System.out.println("Enter the String which is to be radio staticed:");
		String toStaticed = input.nextLine();
		int lengthToBe = toStaticed.length();
		int third = lengthToBe / 3 ;
		String firstThird = toStaticed.substring(0 , third );
		String secondThird = toStaticed.substring(third * 2 );
		toStaticed = toStaticed.replace(firstThird , "-");
		toStaticed = toStaticed.replace(secondThird , "-");
		System.out.println(toStaticed);
		
		// This code replaces the first and the last third of the inputted string into '-' by dividing the length of the inputted string which gives you the number of characters in each third.
    }
}