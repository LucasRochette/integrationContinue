public class User {

    private String firstname;
    private String lastname;
    private String email;
    private int age;

    public User(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }


    boolean isValid() {
        return age > 13 && !firstname.isEmpty() && !lastname.isEmpty() && !email.isEmpty();
    }
}
