public class Employee
{
    private String name;
    private String gender;
    private String jobTitle;
    private Organization organization;
    private String birthDate;
    
    public Employee(String theName, String theGender, String title, Organization org, String theBirthDate)
    {
        name = theName;
        gender = theGender;
        jobTitle = title;
        organization = org;
        birthDate = theBirthDate;
    }
    public String getName()
    {
        System.out.println(name);
        return name ;
    }
    public String getGender()
    {
        System.out.println(gender);
        return  gender ;
    }
    public String getJobTitle()
    {
        System.out.println(jobTitle);
        return jobTitle  ;
    }
    public Organization getOrganization()
    {
        System.out.println(organization.getOrganizationName());
        return organization ;
        
    }
    public String getBirthDate()
    {
        System.out.println(birthDate);
        return birthDate;
    }
    public String toString()
    {
        String nme = name + " , " + jobTitle + " in " + organization.getOrganizationName() + " is a " + gender + " born on " + birthDate ;
        System.out.println(nme);
        return nme;
    }
    public boolean equals(Employee other)
    {
        if(this.name.equals(other.name))
        {
            if(this.gender.equals(other.gender))
            {
                if(this.jobTitle.equals(other.jobTitle))
                {
                    if(this.organization.equals(other.organization))
                    {
                        if(this.birthDate.equals(other.birthDate))
                        {
                            System.out.println(this.name +" is the same as "+other.name);
                            return true;
                        }
                        else
                        {
                            System.out.println("They are not the same");
                            return false;
                        }
                    }
                    else
                    {
                        System.out.println("They are not the same");
                        return false;
                    }
                }
                else
                {
                    System.out.println("They are not the same");
                    return false;
                }
            }
            else
            {
                System.out.println("They are not the same");
                return false;
            }
        }
        else
        {
            System.out.println("They are not the same");
            return false;
        }
    }
    public void changeJobTitle (String newTitle)
    {
        jobTitle = newTitle;
    }
    public void changeName(String newName)
    {
        name = newName;
    }
    public void changeOrganization(Organization org)
    {
        organization = org;
    }
}
