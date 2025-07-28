import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class SortStudentsByMarks {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shoaib", 85));
        students.add(new Student("Ayesha", 92));
        students.add(new Student("Rahul", 78));
        students.add(new Student("Neha", 90));

        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        System.out.println("Students sorted by marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
