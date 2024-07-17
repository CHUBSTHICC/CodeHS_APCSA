public class Student
{
    private String name;
    private int age;
    private double gpa;
    
    public Student(String stuName, int stuAge, double stuGpa)
    {
        name = stuName;
        age = stuAge;
        gpa = stuGpa;
    }
    
    public Student()
    {
        name = "Vinny Viking";
        age = 14;
        gpa = 4.0;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int theAge)
    {
        age = theAge;
    }
    
    public String toString()
    {
        return name + " is a " + age + " y.o. student with a GPA of " + gpa;
    }
}
