import java.io.*;
import java.util.*;

public class Portal {
    private static final String USERS_FILE = "data/users.txt";
    private static final String JOBS_FILE = "data/jobs.txt";
    Scanner sc = new Scanner(System.in);

    public void registerUser() {
        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();

            User user = new User(username, email);
            FileWriter fw = new FileWriter(USERS_FILE, true);
            fw.write(user.toFileFormat() + "\n");
            fw.close();
            System.out.println("✅ User registered successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void postJob() {
        try {
            System.out.print("Enter job title: ");
            String title = sc.nextLine();
            System.out.print("Enter job description: ");
            String desc = sc.nextLine();
            System.out.print("Enter company name: ");
            String comp = sc.nextLine();

            Job job = new Job(title, desc, comp);
            FileWriter fw = new FileWriter(JOBS_FILE, true);
            fw.write(job.toFileFormat() + "\n");
            fw.close();
            System.out.println("✅ Job posted successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void viewJobs() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(JOBS_FILE));
            String line;
            System.out.println("\n📄 Available Jobs:\n");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3) {
                    System.out.println("Title: " + data[0]);
                    System.out.println("Description: " + data[1]);
                    System.out.println("Company: " + data[2]);
                    System.out.println("--------");
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
