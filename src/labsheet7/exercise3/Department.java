package labsheet7.exercise3;

public class Department {
    private String departmentName;
    private Student students[];

    public Department(String departmentName, Student students[]){
        setDepartmentName(departmentName);
        setStudents(students);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String toString(){

        String str ="\nName: " + getDepartmentName() + "\nList of Students: ";

        for(int i=0;i<getStudents().length;i++)
          if(students[i]!=null)
              str+=students[i];

          return str;
    }
}
