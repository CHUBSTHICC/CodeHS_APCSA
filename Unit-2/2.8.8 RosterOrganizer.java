public class RosterOrganizer
{
    private String student;
    
    public RosterOrganizer(String studentName)
    {
        student = studentName;
    }
    
    // Returns the word
    public String getStudent()
    {
        return student;
    }
    
    // Returns true if student comes
    // before otherStudent.
    // Returns false otherwise.
    public boolean placeBefore(String otherStudent)
    {
        boolean beforo = false;
        student.compareTo(otherStudent);
        student.compareTo(otherStudent);  
        int before = student.compareTo(otherStudent);
        if (student.compareTo(otherStudent) < 0)
            beforo = true;
        else
            beforo = false;
        return beforo;
        
        
    }
    
    
    // Returns true if student comes
    // after otherStudent.
    // Returns false otherwise.
    public boolean placeAfter(String otherStudent)
    {
        boolean aftor = false;
        student.compareTo(otherStudent);
        student.compareTo(otherStudent);  
        int after = student.compareTo(otherStudent);
        if (student.compareTo(otherStudent) > 0)
            aftor = true;
        else
            aftor = false;
        return aftor;
    }
    
    
    // Returns true if student is equal to otherStudent.
    // Returns false otherwise.
    public boolean isEqual(String otherStudent)
    {
        student.equals(otherStudent);
        boolean equal = student.equals(otherStudent);
        return equal;
    }
    
    
}
