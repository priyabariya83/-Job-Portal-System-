public class User {
    String username;
    String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String toFileFormat() {
        return username + "," + email;
    }
}
