import java.util.Objects;

public class Student{
//this is HashSet implementation on Custom objects  in LinkedHashSet Class
    public int rollno;
    public String Name;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", Name='" + Name + '\'' +
                '}';
    }

    // so that objects having same roll number are treated as duplicates
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        Name = name;
    }
}