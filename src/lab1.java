import java.util.*;
import java.time.*;
public class lab1 {
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Student> students = new ArrayList<>();

            System.out.println("Enter the number of students:");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter student " + (i+1) + " details:");
                System.out.println("ID:");
                int id = scanner.nextInt();
                System.out.println("Name:");
                String name = scanner.next();
                System.out.println("Address:");
                String address = scanner.next();
                System.out.println("Phone Number:");
                int phoneNumber = scanner.nextInt();
                System.out.println("Birth Date (yyyy-mm-dd):");
                LocalDate birthDate = LocalDate.parse(scanner.next());
                System.out.println("Admission Date (yyyy-mm-dd):");
                LocalDate admissionDate = LocalDate.parse(scanner.next());

                students.add(new Student(id, name, address, phoneNumber, birthDate, admissionDate));
            }

            Collections.sort(students, Comparator.comparingInt(s -> s.id));

            System.out.println("Enter the year of birth/admission to filter students:");
            int yearFilter = scanner.nextInt();

            System.out.println("Students born in the year " + yearFilter + ":");
            for (Student student : students) {
                if (student.birthDate.getYear() == yearFilter) {
                    System.out.println(student);
                }
            }

            System.out.println("\nStudents admitted in the year " + yearFilter + ":");
            for (Student student : students) {
                if (student.admissionDate.getYear() == yearFilter) {
                    System.out.println(student);
                }
            }
        }
    }


}
