package b4;

import b1.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public record User(String username, String email, String Status){};

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("alice", "alice@gmail.com", "ACTIVE"));
        users.add(new User("bob", "bob@yahoo.com", "INACTIVE"));
        users.add(new User("charlie", "charlie@gmail.com", "ACTIVE"));
        users.add(new User("alice", "alice@gmail.com", "ACTIVE"));

        users.stream()
                .collect(Collectors.toMap(User::username, u -> u, (u1,u2) -> u1))
                .values()
                .forEach(System.out::println);
    }
}
