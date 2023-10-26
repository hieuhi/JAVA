import java.time.LocalDate;
import java.time.Period;

public class Student {
        int id;
        String name;
        String address;
        int phoneNumber;
        LocalDate birthDate;
        LocalDate admissionDate;
        int age;
        int yearOfStudy;

        public Student(int id, String name, String address, int phoneNumber, LocalDate birthDate, LocalDate admissionDate) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.birthDate = birthDate;
            this.admissionDate = admissionDate;

            // Calculate age and year of study
            this.age = Period.between(birthDate, LocalDate.now()).getYears();
            this.yearOfStudy = Period.between(admissionDate, LocalDate.now()).getYears() + 1;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber +
                    ", Birth Date: " + birthDate + ", Admission Date: " + admissionDate +
                    ", Age: " + age + ", Year of Study: " + yearOfStudy;
        }
    }

