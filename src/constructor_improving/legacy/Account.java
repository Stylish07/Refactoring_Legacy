package constructor_improving.legacy;

public class Account {

    private UserService userService = new UserService();

    public User createUser(String id, String password, String name) {
        User user = new User(id, password, name);

        return userService.create(user);
    }

    public User updateUser(String id, String password, String name, String email, String address, String mobile, String passport) {
        User user = new User(id, password, name, email, address);
        user.setMobile(mobile);
        user.setPassport(passport);

        return userService.update(user);
    }

}
