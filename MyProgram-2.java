import java .util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        // 4.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes you used: ");
        Double numberUsed = new Double(input.nextDouble());
        Double numberExtra = new Double(numberUsed - 450) ;
        System.out.println("=========================");
        System.out.println("Your basic plan cost $39.99/month");
        Double chargeExtra = new Double(numberExtra * 0.45 );
        if(numberExtra > 0)
        {
            System.out.println("You will be charged $"+chargeExtra+" for the minutes you used");
        }
        else
        {
            System.out.println("You will be charged $0.0  for the minutes you used");
        }
        Double finalCharges = new Double(39.99 + chargeExtra);
        System.out.println("Your total bill is $"+finalCharges);
        System.out.println(" ");
        //1
        System.out.println("Enter two lucky numbers: ");
        Integer num1 = new Integer(input.nextInt());
        Integer num2 = new Integer(input.nextInt());
        Integer num3 = new Integer(num1 + num2);
        Integer num4 = new Integer(num1 * num2);
        Integer num5 = new Integer(num4 - num3);
        Integer num6 = new Integer(num1 / num2);
        Float float1 = new Float(num1);
        Float float2 = new Float(num2);
        Float float3 = new Float((float1 / float2) * 10);
        System.out.println("Lucky Numbers: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(float3);
        //3
        System.out.println("US Dollars :");
        Double dollars = new Double(input.nextDouble());
        Double euros = new Double(dollars * 0.89);
        System.out.println("Euros : "+ euros);
        //2
        
        System.out.println("Enter the number of miles on odometer now:");
        Double present = new Double(input.nextDouble());
        System.out.println("Enter the number of miles on odometer when you last filled up:");
        Double past = new Double(input.nextDouble());
        Double milesTravelled = new Double(present - past);
        System.out.println("You have travelled "+milesTravelled+" miles");
        System.out.println("Enter the gallons of gas used: ");
        Double gasUsed = new Double(input.nextDouble());
        Double mpg = new Double(milesTravelled / gasUsed);
        System.out.println("==========================");
        System.out.println("Your Miles Per Gallon: "+mpg);
        
    }
}