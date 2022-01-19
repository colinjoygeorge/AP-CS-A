public class MyProgram
{
    public static void main(String[] args)
    {
        //Organization number 1
        Organization google = new Organization("Google" , 123456789);
        System.out.println(google);
        //Organization number 2
        Organization bing = new Organization("Bing" , 12345678);
        System.out.println(bing);
        //Employee number 1
        Employee num1 = new Employee("Colin Joy George" , "male" , "CEO" , google ,"09-17-2003" );
        num1.toString();
        num1.getName();
        num1.getGender();
        num1.getJobTitle();
        num1.getOrganization();
        num1.getBirthDate();
        num1.changeName("Colin");
        num1.getName();
        num1.changeJobTitle("Chairman");
        num1.getJobTitle();
        num1.changeOrganization(bing);
        num1.getOrganization();
        //Employee number 2
        Employee num2 = new Employee("Colin","male","CEO", bing , "09-17-2003");
        num2.toString();
        num2.equals(num1);
        num1.equals(num1);
    }
}