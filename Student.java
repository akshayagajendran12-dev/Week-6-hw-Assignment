class Student {
    int studentId;
    String name;
    String department;
    double marks;

    Student(int studentId, String name,
            String department, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student(
            101, "Ravi", "CSE", 85.5
        );

        Student s2 = new Student(
            102, "Anitha", "ECE", 92.0
        );

        Student s3 = new Student(
            103, "Karthik", "IT", 78.5
        );

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
