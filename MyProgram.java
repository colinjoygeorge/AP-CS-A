import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter name: ");
        String nplayer = input.nextLine();
        int u = 0 ;
        while(true)
        {    
            System.out.println("Please enter an number (1 or 2 or 3) or (exit) to quit");
            String topicpre = input.nextLine();
            if(topicpre.equals("1"))
            {
                System.out.println("Every correct answer gains you a point. Enter every aspect of the answer in words suh as words for numbers.");
                System.out.println("Enter Start to continue to quiz");
                String starterR1 = input.nextLine();
                System.out.println("What is it that is preventing the atmosphere from drifting off into space?");
                String Q1 = input.nextLine();
                if(Q1.toLowerCase().equals("gravity"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                }
                else
                {
                    System.out.println("Incorrect Answer- Correct Answer: gravity");
                }
                System.out.println("How long does it take the earth to spin once on its axis?");
                String Q2 = input.nextLine();
                if(Q2.toLowerCase().equals("one day"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                } 
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: one day");
                }
                System.out.println("What nationally-observed day in the U.S. marks winter's midpoint?");
                String Q3 = input.nextLine();
                if(Q3.toLowerCase().equals("groundhog day"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: Groundhog day");
                }
                System.out.println("What type of glands do pigs not have and so must wallow in mud to beat the heat?");
                String Q4 = input.nextLine();
                if(Q4.toLowerCase().equals("sweat glands"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: Sweat Glands");
                }
                System.out.println("What kind of gas was used in trenches in the World War 1?");
                String Q5 = input.nextLine();
                if(Q5.toLowerCase().equals("mustard gas"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                }
                else
                {
                    System.out.println("IncorrectAnswer - Correct Answer: mustard gas");
                }
            }
            else if(topicpre.equals("2"))
            {    
                System.out.println("Every correct answer gains you a point. Enter every aspect of the answer in words suh as words for numbers.");
                System.out.println("Enter Start to continue to quiz");
                String starterR2 = input.nextLine();
                System.out.println("Argentinean revolutionary Ernesto Guevara de la Serna was  better known as whom?");
                String Q6 = input.nextLine();
                if(Q6.toLowerCase().equals("che guevara"))
                {
                    System.out.println("Correct Answer");
                    u += 2;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: Che Guevara");
                }
                System.out.println("In What city were you supposed to wear flowers in your hair in the 1960s?");
                String Q7 = input.nextLine();
                if(Q7.toLowerCase().equals("san fransisco"))
                {
                    System.out.println("Correct Answer");
                    u += 2;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: San Fransisco");
                }
                System.out.println("The Heisman Trophy is presented in which sport?");
                String Q8 = input.nextLine();
                if(Q8.toLowerCase().equals("football"))
                {
                    System.out.println("Correct Answer");
                    u += 2;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: Football");
                }
                System.out.println("The hole in the ozone layer formed over which continent?");
                String Q9 = input.nextLine();
                if(Q9.toLowerCase().equals("antartica"))
                {
                    System.out.println("Correct Answer");
                    u += 2;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: Antartica");
                }
                System.out.println("On which street was the New York Stock Exchange established?");
                String Q10 = input.nextLine();
                if(Q10.toLowerCase().equals("wall street"))
                {
                    System.out.println("Correct Answer");
                    u += 2;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: Wall Street");
                }
            }
            else if(topicpre.equals("3"))
            {
                System.out.println("Every correct answer gains you a point. Enter every aspect of the answer in words suh as words for numbers.");
                System.out.println("Enter Start to continue to quiz");
                String starterR3 = input.nextLine();
                System.out.println("What was it that turned Peter Parker into the Spiderman?");
                String Q11 = input.nextLine();
                if(Q11.toLowerCase().equals("radioactive spider"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: Radioactive Spider");
                }
                System.out.println("In Michigan it is illegal to chain what to a fire hydrant?");
                String Q12 = input.nextLine();
                if(Q12.toLowerCase().equals("alligator"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: Alligator");
                }
                System.out.println("Which Jamaican runner is an 11-time world champion and holds the record in the 100 and 200-meter race?");
                String Q13 = input.nextLine();
                if(Q13.toLowerCase().equals("usain bolt"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                }
                else
                {
                    System.out.println("Incorrest Answer - Correct Answer: Usain Bolt");
                }
                System.out.println("Who discovered penicillin?");
                String Q14 = input.nextLine();
                if(Q14.toLowerCase().equals("alexander fleming"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct  Answer: Alexander Fleming");
                }
                System.out.println("Who is often credited with creating the world’s first car?");
                String Q15 = input.nextLine();
                if(Q15.toLowerCase().equals("carl benz"))
                {
                    System.out.println("Correct Answer");
                    u += 1;
                }
                else
                {
                    System.out.println("Incorrect Answer - Correct Answer: Carl Benz");
                }
            }
            else if(topicpre.equals("exit"))
            {
                Player new1 = new Player(nplayer, u);
                System.out.println(new1.toString());
                break;
            }
        }
    }
}