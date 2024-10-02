package firstpackage;
//	WAP to accept name, marks of five students and create merit list based on marks

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class twentyfive {

    // Inner class to store student details
    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the students
        Student[] students = new Student[5];

        // Input student details
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(name, marks);
        }

        // Sort students based on marks in descending order
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s2.marks, s1.marks);
            }
        });

        // Display the merit list
        System.out.println("\nMerit List:");
        System.out.println("---------------------------------");
        System.out.printf("%-20s %-5s\n", "Name", "Marks");
        System.out.println("---------------------------------");

        for (Student student : students) {
            System.out.printf("%-20s %-5d\n", student.name, student.marks);
        }

        scanner.close();
    }
}
