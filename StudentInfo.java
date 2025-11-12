class Student {
    int id;
    String name;
    int age;
    String course;
    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("-----------------------");
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student(101, "Alice", 20, "Computer Science");
        Student s2 = new Student(102, "Bob", 22, "Mechanical Engineering");

        // Display information
        s1.displayInfo();
        s2.displayInfo();
    }
}
