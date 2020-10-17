package labsheet7.exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {
        Student s1 = new Student("Jake", 154345 , "Computing");
        Student s2 = new Student("Mary", 2434532 , "Creative Media");
        Student s3 = new Student("Tommy", 453726 , "Computing");
        Student s4 = new Student("Peter", 623456 , "Creative Media");

        Student computingStudents[] = new Student[10];
        computingStudents[0] = s1;
        computingStudents[2] =s3;

        Student creativeMediaStudents[] = new Student[10];
        creativeMediaStudents[1] = s2;
        creativeMediaStudents[3] = s4;

        Department computing = new Department("Computing", computingStudents);
        Department creativeMedia = new Department("Creative Media", creativeMediaStudents);

        Department departments[] = new Department[5];
        departments[0] = computing;
        departments[1] = creativeMedia;

        Institute institute = new Institute("Institute of Technology Tralee", departments);

        System.out.println(institute);

        System.out.println("Total students in institute: ");
        System.out.println(institute.getTotalStudents());

        System.out.println("\n\nJake now moving from the Computing dept to the Creative Media dept");

        int creativeMediaSubscript=-1, computingSubscript=-1;

        for(int i=0;i<departments.length;i++) {
            if (departments[i] != null && departments[i].getDepartmentName().equals("Creative Media"))
                creativeMediaSubscript = i;

            if (departments[i] != null && departments[i].getDepartmentName().equals("Computing"))
                computingSubscript = i;

        }

        if(creativeMediaSubscript!=-1 && computingSubscript!=-1){

            Student[] allDeptStudents = departments[computingSubscript].getStudents();

            int j;

            for(j=0;j<allDeptStudents.length;j++){
                if(allDeptStudents[j]!=null){
                    if(allDeptStudents[j].getId()==154345){
                        System.out.println("\nFound Jake\n\n");

                        allDeptStudents[j].setDept("Creative Media");

                        departments[creativeMediaSubscript].getStudents()[2] = allDeptStudents[j];

                        break;

                    }
                }
            }
            if(j==allDeptStudents.length)
                System.out.println("\nSorry couldn't find Jake");
        }
        System.out.println(institute);






    }

}
