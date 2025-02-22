public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    // Implement this method!
    // Returns the Student with the highest examImprovement score
    public Student getMostImprovedStudent()
    {
    // your code goes here! 
        if(numStudentsAdded == 0)
        {
            return null;
        }
        Student best = students[0];
        
        for(int i = 1; i < numStudentsAdded; i++)
        {
            if(students[i].getExamImprovement() > best.getExamImprovement())
            {
                best = students[i];
            }
        }
        return best;
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
