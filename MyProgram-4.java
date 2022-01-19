import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Tweet:");
        String potentialTweet = input.nextLine();
        potentialTweet = potentialTweet.toLowerCase();
        int potentialLength = potentialTweet.length();
        if(potentialLength <= 280)
        {
            System.out.println("Length Correct");
            
            
            int count = 0;
            for(int i = 0 ; i < potentialTweet.length(); i++ )
            {
                if(potentialTweet.charAt(i) == '#')
                {
                    String subentered = potentialTweet.substring(i , potentialTweet.length() - 1);
                    int k = subentered.indexOf(" ");
                    if(k != i + 1)
                    {
                        if(k != -1 && k > i + 1)
                        {
                            count += 1;
                            i = k;
                        }
                        else
                        {
                            count += 1;
                            break;
                        }
                    }
                }
                
            }
            System.out.println("Number of Hashtags: "+count);
            
            int count2 = 0;
            for(int i = 0 ; i < potentialTweet.length(); i++ )
            {
                if(potentialTweet.charAt(i) == '@')
                {
                    String subentered = potentialTweet.substring(i , potentialTweet.length() - 1);
                    int k = subentered.indexOf(" ");
                    if(k != i + 1)
                    {
                        if(k != -1 && k > i )
                        {
                            if(k > i + 1)
                            {
                                count2 += 1;
                                i = k;
                            }    
                        }
                        else
                        {
                            count2 += 1;
                            break;
                        }
                    }
                }
            }
            System.out.println("Number of attributions: "+count2);
            int count3 = 0;
            potentialTweet = potentialTweet.toLowerCase();
            for(int i = 0; i < potentialTweet.length() - 6 ; i++ )
            {
                String cout2 = potentialTweet.substring(i , i + 7);
                
                if(cout2.equals("http://"))
                {
                    count3 = count3 + 1;
                }
            }
            System.out.println("Number of links: "+count3);
        }
        else
        {
            int excessLength = potentialLength - 280 ;
            System.out.println("Number of excess characters = " + excessLength);
        }
    }
}