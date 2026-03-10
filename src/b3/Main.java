package b3;

import b1.User;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        Optional<User> user = repo.findUserByUsername("alice");

        user.ifPresentOrElse(
                u -> System.out.println("Welcome " + u.email()),
                () -> System.out.println("Guest login")
        );
    }
}
