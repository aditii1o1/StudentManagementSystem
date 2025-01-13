public class StudentMain {

    public static void main(String[] args) {
        // Create a new student object
        Student student = new Student("Aditi", 19, "IT", "S12345");

        // Display the student's information
        student.displayInfo();
    }
}

class Student {
    private String name;
    private int age;
    private String department;
    private String studentID;

    // Constructor
    public Student(String name, int age, String department, String studentID) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.studentID = studentID;
    }

    // Getter and Setter methods (optional, for future use)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Student ID: " + studentID);
    }
}
