public class Organization 
{
    private String organizationName;
    private int numEmployees;
    
    public Organization( String name , int employees)
    {
        organizationName = name;
        numEmployees = employees;
    }
    
    public String getOrganizationName()
    {
        return organizationName + "";
    }
    public int getNumEmployees()
    {
        System.out.println(this.numEmployees);
        return numEmployees ;
    }
    public String toString()
    {
        return organizationName + " has "+numEmployees+" employees.";
    }
    public boolean equals(Organization other)
    {
        if(this.organizationName.equals(other.organizationName))
        {
            if(this.numEmployees == other.numEmployees)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public void changeOrganizationName(String newName)
    {
        organizationName = newName ;
    }
}
