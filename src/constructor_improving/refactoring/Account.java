package constructor_improving.refactoring;

public class Account {

    private UserService userService = new UserService();

    public User createUser(String id, String password, String name) {
        User user = new User.Builder(id, password, name).build();

        return userService.create(user);
    }

    public User updateUser(String id, String password, String name, String email, String address, String mobile, String passport) {
        User user = new User.Builder(id, password, name).email(email).address(address).mobile(mobile).passport(passport).build();

        return userService.update(user);
    }

}
