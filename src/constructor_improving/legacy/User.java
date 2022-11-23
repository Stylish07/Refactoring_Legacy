package constructor_improving.legacy;

public class User {

    private String id;
    private String password;
    private String name;
    private String email;
    private String address;
    private String mobile;
    private String passport;

    public User(String id, String password, String name) {
        this(id, password, name, null);
    }

    public User(String id, String password, String name, String email) {
        this(id, password, name, email, null);
    }

    public User(String id, String password, String name, String email, String address) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

}
