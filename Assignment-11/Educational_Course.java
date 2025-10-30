import java.util.Scanner;
class Course {
    String courseName;
    int duration; 
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; 
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    double calculateFinalFee() {
        return fee * (1 - discount / 100);
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + calculateFinalFee());
    }
}
public class Educational_Course{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Duration (hours): ");
        int duration = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Platform: ");
        String platform = sc.nextLine();
        System.out.print("Is the course recorded? (true/false): ");
        boolean recorded = sc.nextBoolean();
        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter Discount (%): ");
        double discount = sc.nextDouble();
        PaidOnlineCourse course = new PaidOnlineCourse(name, duration, platform, recorded, fee, discount);
        System.out.println("\n===== Course Details =====");
        course.displayDetails();
        sc.close();
    }
}
