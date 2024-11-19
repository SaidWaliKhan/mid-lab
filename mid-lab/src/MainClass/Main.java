import java.util.Scanner;

class Applicant {
    String name;
    int age, marks, testScore, interviewScore;

    Applicant(String name, int age, int marks, int testScore, int interviewScore) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.testScore = testScore;
        this.interviewScore = interviewScore;
    }

    String process() {
        if (age < 18 || marks < 50) return "Not Eligible";
        if (testScore < 60) return "Failed Test";
        if (interviewScore < 70) return "Failed Interview";
        return "Selected for Merit List";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of applicants: ");
        int n = scanner.nextInt();  // Number of applicants

        // Clear the buffer
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            // Collect applicant details
            System.out.println("\nEnter details for Applicant " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Age: ");
            int age = scanner.nextInt();
            
            System.out.print("Marks (Previous Marks): ");
            int marks = scanner.nextInt();
            
            System.out.print("Test Score: ");
            int testScore = scanner.nextInt();
            
            System.out.print("Interview Score: ");
            int interviewScore = scanner.nextInt();
            
            // Clear the buffer
            scanner.nextLine();
            
            // Create Applicant object and process the admission
            Applicant applicant = new Applicant(name, age, marks, testScore, interviewScore);
            String result = applicant.process();
            
            // Output the result for the applicant
            System.out.println(name + ": " + result);
        }
        
        // Close the scanner to prevent memory leak
        scanner.close();
    }
}
