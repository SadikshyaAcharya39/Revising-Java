package level6;

public class ConstructorLoading {
    int studentId;
    String studentName;
    String studentDOB;


    public ConstructorLoading(int studentId, String studentName, String studentDOB){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDOB = studentDOB;
    }

    public ConstructorLoading(String studentName, int studentId, String studentDOB){
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentDOB = studentDOB;
    }

    public ConstructorLoading(String studentDOB, String studentName, int studentId){
        this.studentDOB = studentDOB;
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public static void main(String[] args) {
        ConstructorLoading constructorLoading1 = new ConstructorLoading(1, "Amir", "2010");
        ConstructorLoading constructorLoading2 = new ConstructorLoading( "Amit", 2, "1980");
        ConstructorLoading constructorLoading3 = new ConstructorLoading("2020", "Anju", 3);

        System.out.println("Student ID: " + constructorLoading1.studentId  + "  " + "Student Name: " + constructorLoading1.studentName + "  " +  "Student DOB: " + constructorLoading1.studentDOB);
        System.out.println("Student Name: " + constructorLoading2.studentName + "  " + "Student ID: " + constructorLoading2.studentId + "  " + "Student DOB: " + constructorLoading2.studentDOB);
        System.out.println("Student DOB: " + constructorLoading3.studentDOB + "  "  + "Student Name: " + constructorLoading3.studentName+ "  " + "Student ID: " + constructorLoading3.studentId);
    }
}
