package builder;

public class TryUserBuilder {
    public static void main(String[] args) {
        User user = new User.Builder("poxos","Poxosyan",25,"mail").build();
    }
}