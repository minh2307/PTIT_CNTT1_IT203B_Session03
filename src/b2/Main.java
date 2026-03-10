package b2;

import b1.User;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("alice", "alice@gmail.com", "ACTIVE");
        User u2 = new User("bob", "bob@yahoo.com", "INACTIVE");
        User u3 = new User("charlie", "charlie@gmail.com", "ACTIVE");

        List<User> list = Arrays.asList(u1, u2, u3);

        list.stream().filter(u -> u.email().contains("gmil"))
                .forEach(System.out::println);

    }
}
