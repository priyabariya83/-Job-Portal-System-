import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Portal portal = new Portal();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Job Portal System ===");
            System.out.println("1. Register User");
            System.out.println("2. Post Job");
            System.out.println("3. View Jobs");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    portal.registerUser();
                    break;
                case 2:
                    portal.postJob();
                    break;
                case 3:
                    portal.viewJobs();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("❌ Invalid option.");
            }
        } while (choice != 0);
    }
}
