package builder;

public class User {
    private String name;
    private String surname;
    private int age;
    private String mail;


    private User(Builder builder) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }


    public static class Builder {
        private String name;
        private String surname;
        private int age;
        private String mail;

        public Builder(String name, String surname, int age, String mail) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.mail = mail;
        }


        public User build() {
            return new User(this);
        }


    }

}





