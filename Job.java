public class Job {
    String title;
    String description;
    String company;

    public Job(String title, String description, String company) {
        this.title = title;
        this.description = description;
        this.company = company;
    }

    public String toFileFormat() {
        return title + "," + description + "," + company;
    }
}
