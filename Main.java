
import java.util.*;

class Student {
    String name;
    int english, hindi, science, math, computer;

    Student(String name, int english, int hindi, int science, int math, int computer) {
        this.name = name;
        this.english = english;
        this.hindi = hindi;
        this.science = science;
        this.math = math;
        this.computer = computer;
    }

    int getTotal() {
        return english + hindi + science + math + computer;
    }

    double getAverage() {
        return getTotal() / 5.0;
    }

    int getHighest() {
        return Math.max(english,
                Math.max(hindi,
                Math.max(science,
                Math.max(math, computer))));
    }

    int getLowest() {
        return Math.min(english,
                Math.min(hindi,
                Math.min(science,
                Math.min(math, computer))));
    }

    void displayReport() {
        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + getTotal());
        System.out.println("Average Marks: " + getAverage());
        System.out.println("Highest Marks: " + getHighest());
        System.out.println("Lowest Marks: " + getLowest());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Student Name: ");
            String name = sc.nextLine();

            System.out.print("English: ");
            int english = sc.nextInt();

            System.out.print("Hindi: ");
            int hindi = sc.nextInt();

            System.out.print("Science: ");
            int science = sc.nextInt();

            System.out.print("Math: ");
            int math = sc.nextInt();

            System.out.print("Computer: ");
            int computer = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, english, hindi, science, math, computer));
        }

        System.out.println("\n===== All Students Report =====");

        for (Student s : students) {
            s.displayReport();
        }
    }
}