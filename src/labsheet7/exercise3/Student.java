package labsheet7.exercise3;

public class Student {

    private int id;
    private String name;
    private String dept;


    public Student(String name, int id, String dept){
        setId(id);
        setName(name);
        setDept(dept);

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "\n\nName: " + getName() +  "\nID: " + getId() + "\nDepartment: " + getDept() + "\n";
    }
}
