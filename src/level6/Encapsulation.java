package level6;

public class Encapsulation {
    private int studentID;
    private String studentName;
    private int studentDOB;

    public Encapsulation(int studentID, String studentName, int studentDOB){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentDOB = studentDOB;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public int getStudentDOB(){
        return studentDOB;
    }

    public void setStudentDOB(int studentDOB){
        this.studentDOB = studentDOB;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation1 = new Encapsulation(1, "Sadikshya", 2004);
        Encapsulation encapsulation2 = new Encapsulation(2, "Anju", 2015);
        Encapsulation encapsulation3 = new Encapsulation(3, "Amir", 2012);

        encapsulation1.setStudentID(4);
        encapsulation1.setStudentName("Govinda");
        encapsulation1.setStudentDOB(2030);

        System.out.println("Student ID: " + encapsulation1.getStudentID() + "  Student Name: " + encapsulation1.getStudentName() + "  Student DOB: " + encapsulation1.getStudentDOB());
        System.out.println("Student ID: " + encapsulation2.getStudentID() + "  Student Name: " + encapsulation2.getStudentName()+ "   Student DOB: " + encapsulation2.getStudentDOB());
        System.out.println("Student ID: " + encapsulation3.getStudentID() + "  Student Name: " + encapsulation3.getStudentName()+ "   Student DOB: " + encapsulation3.getStudentDOB());
    }
}
